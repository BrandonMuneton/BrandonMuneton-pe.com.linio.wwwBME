package pe.com.linio.www.interactions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static pe.com.linio.www.userinterfaces.HomePageElements.OPTIONS_LIST_AMOUNT;
import static pe.com.linio.www.userinterfaces.HomePageElements.LIST;

import static pe.com.linio.www.userinterfaces.ProductsPageElements.PRODUCT_AMOUNT;

import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.TimeoutException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pe.com.linio.www.exceptions.OptionsInListException;

public class SelectInTheListAmount implements Interaction {

	private String option;

	public SelectInTheListAmount(String option) {
		this.option = option;
	}

	public static SelectInTheListAmount theOption(String option) {
		return Tasks.instrumented(SelectInTheListAmount.class, option);
	}

	@Step("{0} Select The List The Option '#option'")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(OPTIONS_LIST_AMOUNT, isEnabled()));
		actor.attemptsTo(Click.on(OPTIONS_LIST_AMOUNT));
		actor.attemptsTo(SelectFromOptions.byVisibleText(option).from(LIST));
	}
}