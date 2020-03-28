package pe.com.linio.www.tasks.web;

import static pe.com.linio.www.userinterfaces.ProductsPageElements.ADD_TO_CART;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import pe.com.linio.www.interactions.SelectInTheListAmount;
import pe.com.linio.www.interactions.SelectInTheListSize;

public class AddProduct implements Task {

  private String amount;
  private String size;
  private boolean needSize;

  public AddProduct(String amount) {
    this.amount = amount;
    this.needSize = false;
  }
  
  public AddProduct(String amount, String size) {
	    this.amount = amount;
	    this.size = size;
	    this.needSize = true;
	  }

  public static AddProduct toShoppingCart(String amount, String size) {
    return Tasks.instrumented(AddProduct.class, amount, size);
  }
  
  public static AddProduct toShoppingCart(String amount) {
	    return Tasks.instrumented(AddProduct.class, amount);
  }

  public AddProduct needSize(String size) {
    this.needSize = true;
    return this;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SelectInTheListAmount.theOption(amount),
        Check.whether(needSize).andIfSo(
            SelectInTheListSize.theOption(size)
        ),
        Click.on(ADD_TO_CART)
    );
  }
}
