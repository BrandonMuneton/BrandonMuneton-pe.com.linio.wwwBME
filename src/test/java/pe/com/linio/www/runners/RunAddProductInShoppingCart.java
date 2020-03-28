package pe.com.linio.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_product_in_shopping_cart.feature",
    glue = "pe.com.linio.www.stepdefinitions.shoppingCart",
    tags = "@AddingTechnologicalProductsToTheShoppingCart",
    snippets = SnippetType.CAMELCASE)
public class RunAddProductInShoppingCart {

}