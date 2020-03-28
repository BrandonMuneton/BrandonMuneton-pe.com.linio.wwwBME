package pe.com.linio.www.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

@SuppressWarnings("serial")
public class OptionsInListException  extends SerenityManagedException{

	public static final String MESSAGE_ELEMENT_FOUND_IN_LIST ="element not found in list: ";
	public OptionsInListException(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}	
}
