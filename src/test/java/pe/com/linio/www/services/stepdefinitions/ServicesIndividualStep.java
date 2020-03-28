package pe.com.linio.www.services.stepdefinitions;

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
	
	@Given("^init enviroment$")
	public void init_enviroment() {
		user = userServices.getUser();
	}
	
	@Given("^execute soap individual service$")
	public void execute_soap_individual_service() {
		user.attemptsTo(ExecuteServices.execute());
	}
	
	@Then("^validate service$")
	public void  validate_services() {		
		user.should(ResponseConsequence.seeThatResponse(response -> response.statusCode(200).body( PathResponse.result , equalTo("OK. Everything worked as expected."))));
	}

	@Given("^execute post service$")
	public void execute_post_service() {
		user.attemptsTo(ServicesPost.execute());
	}
	
	@Then("^validate response post$")
	public void  validate_response_post() {		
		user.should(ResponseConsequence.seeThatResponse(response -> response.statusCode(302).body( PathResponse.result , equalTo("A resource was successfully created in response to a POST request. The Location header contains the URL pointing to the newly created resource."))));
	}	
	
}
