package pe.com.linio.www.questions;

import static pe.com.linio.www.userinterfaces.ShoppingCartElements.PRODUCT_IN_SHOPPING_CART;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class VerifyProductInTheShoppingCart implements Question<List<String>> {

  public static VerifyProductInTheShoppingCart inTheProductLog() {
    return new VerifyProductInTheShoppingCart();
  }

  @Subject("Verifies the product in the shopping cart In the Question")
  @Override
  public List<String> answeredBy(Actor actor) {
    actor.attemptsTo(
        WaitUntil.the(PRODUCT_IN_SHOPPING_CART, WebElementStateMatchers.isClickable()));
    return Text.of(PRODUCT_IN_SHOPPING_CART).viewedBy(actor).asList();
  }
}