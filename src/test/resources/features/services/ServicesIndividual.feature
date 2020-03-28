@ServiceIndividual
Feature: Generate one activation of individual services

  @ServiceIndividualSuccessfull
  Scenario: active succesfull individual services
    Given init enviroment 
    When execute soap individual service
    Then validate service
    
  @ServiceIndividualSuccessfullPost
  Scenario: active succesfull individual services of type Post
    Given init enviroment 
    When execute post service
    Then validate response post    
