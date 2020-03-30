package pe.com.linio.www.exeptions;

@SuppressWarnings("serial")
public class ShoppingCartException extends AssertionError {

  public ShoppingCartException(String message, Throwable cause) {
    super(message, cause);
  }

}