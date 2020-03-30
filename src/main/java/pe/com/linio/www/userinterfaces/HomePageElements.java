package pe.com.linio.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElements {

  public static final Target SEARCH_BAR = Target.the("Search bar")
      .locatedBy("//div[@class='input-group']//input[@placeholder='Busca productos']");
  public static final Target OPTIONS_LIST_AMOUNT = Target.the("Option list Amount {0}")
      .locatedBy("//button[contains(@class, 'button-product-quantity hidden-sm-down')]");
  public static final Target OPTIONS_LIST_SIZE = Target.the("Option list Size {0}")
      .locatedBy("//div[contains(@class, 'select-dropdown select-dropdown-normal-select-1')]//button[contains(@class, 'form-control form-control-lg')]");
 public static final Target LIST = Target.the("Option list")
      .locatedBy("//div//ul//li[@class='select-dropdown-list-item'][contains(text(),'{0}')]");
  public static final Target LIST_AMOUNT = Target.the("Option list amount {0}")
      .located(By.id("product-quantity"));
  public static final Target LIST_SIZE = Target.the("Option list Size {0}")
      .located(By.id("product-options"));

}