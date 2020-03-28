package pe.com.linio.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPageElements {

  public static final Target PRODUCT_TO_SELECT = Target.the("product to select")
      .locatedBy("(//span[contains(text(),'{0}')])[1]");
  public static final Target PRODUCT_AMOUNT = Target.the("Product amount")
      .locatedBy("//li[@class='select-dropdown-list-item'][contains(text(),'{0}')]");
  public static final Target ADD_TO_CART = Target.the("Add to shopping cart")
      .locatedBy("//button[@id='buy-now']");
}
