package pe.com.linio.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.hasItem;
import static pe.com.linio.www.util.ExceptionConstants.ADD_PRODUCT_IN_SHOPPING_CART;
import static pe.com.linio.www.util.GenericConstants.AMOUNT;
import static pe.com.linio.www.util.GenericConstants.SIZE;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.Map;
import pe.com.linio.www.exeptions.ShoppingCartException;
import pe.com.linio.www.questions.VerifyProductInTheShoppingCart;
import pe.com.linio.www.tasks.AddProduct;
import pe.com.linio.www.tasks.SearchProduct;
import pe.com.linio.www.tasks.SelectProduct;


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
        AddProduct.toShoppingCart(data.get(AMOUNT))
    );
  }

  @When("^he will add the clothing product to the shopping cart$")
  public void heWillAddTheClothingProductToTheShoppingCart(Map<String, String> data) {
    theActorInTheSpotlight().wasAbleTo(
        AddProduct.toShoppingCart(data.get(AMOUNT), data.get(SIZE))
    );
  }

  @Then("^he valid that the (.*) product is registered$")
  public void HeValidThatTheProductIsRegistered(String product) {
    theActorInTheSpotlight().should(
        seeThat(VerifyProductInTheShoppingCart.inTheProductLog(), hasItem(product))
            .orComplainWith(ShoppingCartException.class, ADD_PRODUCT_IN_SHOPPING_CART)
    );
  }

}