package pe.com.linio.www.stepdefinitions.shoppingCart;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.Map;
import pe.com.linio.www.stepdefinitions.GeneralStepDefinitions;
import pe.com.linio.www.tasks.web.AddProduct;
import pe.com.linio.www.tasks.web.SearchProduct;
import pe.com.linio.www.tasks.web.SelectProduct;


public class AddProductInShoppingCartStepDefinitions extends GeneralStepDefinitions {

  @Before
  public void config() {
    setUp();
  }

  @Given("^The user is in the (.*) product$")
  public void theUserIsInTheProduct(String product) {
    theActorInTheSpotlight().wasAbleTo(
        SearchProduct.inSearchBar(product),
        SelectProduct.inTheList(product)
    );
  } 

  @When("^he will add the technological product to the shopping cart$")
  public void heWillAddTheTechnologicalProductToTheShoppingCart(Map<String, String> data) {
    theActorInTheSpotlight().wasAbleTo( 
        AddProduct.toShoppingCart(data.get("amount"))
        );
  }

  @When("^he will add the clothing product to the shopping cart$")
  public void heWillAddTheClothingProductToTheShoppingCart(Map<String, String> data) {
    theActorInTheSpotlight().wasAbleTo(
        AddProduct.toShoppingCart(data.get("amount"), data.get("size")).needSize(data.get("size"))
    );
  }


  @Then("^the valid that the product is registered$")
  public void theValidThatTheProductIsRegistered() {

  }

  @Given("^the user is in the (.*) product, search 2$")
  public void theUserIsInTheProductSearch2(Map<String, String> data, String product) {

  }

}