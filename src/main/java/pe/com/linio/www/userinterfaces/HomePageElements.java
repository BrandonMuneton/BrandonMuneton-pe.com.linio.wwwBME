package pe.com.linio.www.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageElements {

  public static final Target SEARCH_BAR = Target.the("Search bar")
      .locatedBy("//div[@class='input-group']//input[@placeholder='Busca productos']");
  public static final Target OPTIONS_LIST_AMOUNT = Target.the("Option list Amount {0}")
      .locatedBy("//button[contains(@class, 'button-product-quantity hidden-sm-down')]");
  public static final Target OPTIONS_LIST_SIZE = Target.the("Option list Size {0}")
      .locatedBy("//button[contains(@class, 'button select-dropdown-button-normal-select-1')]");
  
  public static final Target LIST  = Target.the("Option list Size {0}").located(By.id("product-quantity"));
  

}
