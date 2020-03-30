package pe.com.linio.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPageElements {

  public static final Target PRODUCT_TO_SELECT = Target.the("product to select")
      .locatedBy("(//span[contains(text(),'{0}')])[1]");
  public static final Target PRODUCT_TITLE = Target.the("product title select")
      .locatedBy("(//span[contains(text(),'{0}')])[2]");
  public static final Target PRODUCT_AMOUNT = Target.the("Product amount")
      .locatedBy("//li[@class='select-dropdown-list-item'][contains(text(),'{0}')]");
  public static final Target PRODUCT_SIZE = Target.the("Product amount")
      .locatedBy("//ul[@class='select-dropdown-list select-dropdown-list-normal-select-1 active']//li[contains(text(),'{0}')]");
  public static final Target ADD_TO_CART = Target.the("Add to shopping cart")
      .locatedBy("//button[@id='buy-now']");
  public static final Target GO_TO_SHOPPING_CART = Target.the("Go to shopping cart")
      .locatedBy("//a[@class='btn btn-sm btn-go-to-cart added-product']");
}