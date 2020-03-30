package pe.com.linio.www.util.services;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class UserServices {

  private Actor user;

  public UserServices() {
    user = Actor.named("user").whoCan(
        CallAnApi.at(SystemEnvironmentVariables.createEnvironmentVariables().getProperty("url")));
  }

  public Actor getUser() {
    return user;
  }

}