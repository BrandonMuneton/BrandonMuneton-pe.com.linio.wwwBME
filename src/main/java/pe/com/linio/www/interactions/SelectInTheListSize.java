package pe.com.linio.www.interactions;

import static pe.com.linio.www.userinterfaces.HomePageElements.OPTIONS_LIST_AMOUNT;
import static pe.com.linio.www.userinterfaces.HomePageElements.OPTIONS_LIST_SIZE;
import static pe.com.linio.www.userinterfaces.ProductsPageElements.PRODUCT_AMOUNT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class SelectInTheListSize implements Interaction {

  private String option;

  public SelectInTheListSize(String option) {
    this.option = option;
  }

  public static SelectInTheListSize theOption(String option) {
    return Tasks.instrumented(SelectInTheListSize.class, option);
  }

  @Step("{0} Select The List The Option '#option'")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(OPTIONS_LIST_SIZE, WebElementStateMatchers.isVisible()),
        Click.on(OPTIONS_LIST_SIZE),
        Click.on(PRODUCT_AMOUNT.of(option)));
  }
}