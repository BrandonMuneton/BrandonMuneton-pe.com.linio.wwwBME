package pe.com.linio.www.tasks.services;

import com.google.gson.JsonObject;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import pe.com.linio.www.util.services.Parameters;
import pe.com.linio.www.util.services.QueryParameters;

public class ServicesPost implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		JsonObject data = new JsonObject();
		data.addProperty("first_name", "Luis");
		data.addProperty("last_name", "tester");
		data.addProperty("gender", "male");
		data.addProperty("email", "testing@test.com");	
		data.addProperty("status", "active");			
		actor.attemptsTo(Post.to("public-api/users").with(request->request.headers("Accept", "application/json")
				.headers("Content-Type", "application/json").headers("Authorization", "Bearer z8dlt7yB5LdS8KyX2shx2yrkfvgNbZgOCdAl")
				.body(data)));
		System.out.println(SerenityRest.lastResponse().asString());
	}

	
	public static ServicesPost execute() {
		return Tasks.instrumented(ServicesPost.class);
	}
}
