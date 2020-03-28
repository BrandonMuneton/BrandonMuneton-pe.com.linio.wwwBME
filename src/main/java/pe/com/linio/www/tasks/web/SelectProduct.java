package pe.com.linio.www.tasks.web;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static pe.com.linio.www.userinterfaces.HomePageElements.SEARCH_BAR;
import static pe.com.linio.www.userinterfaces.ProductsPageElements.PRODUCT_TO_SELECT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectProduct implements Task {

  private String product;

  public SelectProduct(String product) {
    this.product = product;
  }

  public static SelectProduct inTheList(String product) {
    return Tasks.instrumented(SelectProduct.class, product);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(PRODUCT_TO_SELECT.of(product)),
        WaitUntil.the(SEARCH_BAR, isEnabled()));
  }
}
