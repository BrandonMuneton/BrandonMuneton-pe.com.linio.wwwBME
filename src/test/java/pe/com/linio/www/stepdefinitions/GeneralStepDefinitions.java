package pe.com.linio.www.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class GeneralStepDefinitions {

  @Managed(driver = "chrome")
  protected WebDriver hisBrowser;

  @SuppressWarnings("unchecked")
  public void setUp() {
    setTheStage(new Cast());
    theActorCalled("SophosUser");
    theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    theActorInTheSpotlight().wasAbleTo(Open.url("https://www.linio.com.pe/"));
  }

}