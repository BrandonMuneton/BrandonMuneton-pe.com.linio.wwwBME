@ServiceIndividual
Feature: Generate one activation of individual services

  @ServiceIndividualSuccessfull
  Scenario: active succesfull individual services
    Given the user init enviroment
    When he execute individual service
    Then he validate service message OK. Everything worked as expected.
    
  @ServiceIndividualSuccessfullPost
  Scenario: active succesfull individual services of type Post
    Given the user init enviroment
    When he execute service
    Then he validate the service message A resource was successfully created in response to a POST request. The Location header contains the URL pointing to the newly created resource.