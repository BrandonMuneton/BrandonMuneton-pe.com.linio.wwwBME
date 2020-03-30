package pe.com.linio.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartElements {

  public static final Target PRODUCT_IN_SHOPPING_CART = Target.the("product to select added in shopping cart")
      .locatedBy("//body/div[contains(@class,'wrapper wrapper-no-footer container-fluid')]/main[@class='container-fluid container-semi-fluid']/div/div[@class='row']/div[@class='col-lg-9 col-xs-12']/div[@class='cart-item-section']/div[2]/div[2]/div[2]/span[1]");

}
