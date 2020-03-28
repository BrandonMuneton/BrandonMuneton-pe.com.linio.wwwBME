package pe.com.linio.www.tasks.services;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import pe.com.linio.www.util.services.Parameters;
import pe.com.linio.www.util.services.QueryParameters;



public class ExecuteServices implements Task{
	

	@Override
	public <T extends Actor> void performAs(T actor) {	
		actor.attemptsTo(Get.resource(Parameters.pathUser)
				.with(request-> request.queryParams(QueryParameters.token())));
		System.out.println(SerenityRest.lastResponse().asString());
	}


	public static ExecuteServices execute() {
		return Tasks.instrumented(ExecuteServices.class);
	}
	
}
