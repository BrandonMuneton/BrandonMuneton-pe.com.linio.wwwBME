package pe.com.linio.www.stepdefinitions.services;

import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import net.thucydides.core.annotations.Shared;
import pe.com.linio.www.tasks.services.ExecuteServices;
import pe.com.linio.www.tasks.services.ServicesPost;
import pe.com.linio.www.util.services.PathResponse;
import pe.com.linio.www.util.services.UserServices;

public class ServicesIndividualStep {

  @Shared
  UserServices userServices;
  private Actor user;

  @Given("^the user init enviroment$")
  public void theUserInitEnviroment() {
    user = userServices.getUser();
  }

  @Given("^he execute individual service$")
  public void heExecuteIndividualService() {
    user.attemptsTo(ExecuteServices.execute());
  }

  @Then("^he validate service message (.*)$")
  public void heValidateServicesMessage(String message) {
    user.should(ResponseConsequence.seeThatResponse(
        response -> response.statusCode(200).body(PathResponse.result, equalTo(message))));
  }

  @Given("^he execute service$")
  public void heExecuteService() {
    user.attemptsTo(ServicesPost.execute());
  }

  @Then("he validate the service message (.*)$")
  public void heValidateTheServiceMessage(String message) {
    user.should(ResponseConsequence.seeThatResponse(response -> response.statusCode(302)
        .body(PathResponse.result, equalTo(message))));
  }

}