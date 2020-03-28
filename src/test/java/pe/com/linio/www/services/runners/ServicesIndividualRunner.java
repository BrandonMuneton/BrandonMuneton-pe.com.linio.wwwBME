package pe.com.linio.www.services.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)                    
@CucumberOptions(
        features="src/test/resources/features/services/ServicesIndividual.feature",         
        glue = "pe.com.linio.www.services.stepdefinitions",
        tags = "@ServiceIndividualSuccessfullPost")              
public class ServicesIndividualRunner {
}