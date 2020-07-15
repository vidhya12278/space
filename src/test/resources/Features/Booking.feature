@func3
Feature: verifying adactin hotel user login details

@smoke @reg @sanity
  Scenario Outline: verifying user details with valid credentials
    Given user is on hotel page
    When i should enters "<username>" and "<password>"
    And i should click the login button
    
    Examples:
    | username | password |
    | vidhyaes | vid@98   | 
    
   
   @reg 
    Scenario Outline: verifying user details with valid credentials
    Given user is on hotel page
    When i should enters "<username>" and "<password>"
    And i should click the login button
    
    Examples:
    | username | password |
    | vidhyaes | vid@98   | 
