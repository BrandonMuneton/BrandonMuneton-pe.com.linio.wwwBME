package pe.com.linio.www.tasks.web;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static pe.com.linio.www.userinterfaces.HomePageElements.SEARCH_BAR;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class SearchProduct implements Task {

  private String product;

  public SearchProduct(String product) {
    this.product = product;
  }

  public static SearchProduct inSearchBar(String product) {
    return Tasks.instrumented(SearchProduct.class, product);
  }

  @Override
  @Step("{0} enter into the Linio Page and search the product")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(SEARCH_BAR, isEnabled()),
        Click.on(SEARCH_BAR),
        Enter.theValue(product).into(SEARCH_BAR).thenHit(Keys.ENTER)
    );
  }
}
