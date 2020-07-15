@func2
Feature: verifying adactin hotel user details
   @smoke
  Scenario Outline: user personal valid credentials
    Given user is on hotel booking page
    When i should enter payment deatils "<Firstname>" and "<Lastname>" and "<Billingaddress>" and "<creditcardno>" and "<creditcardtype>"
    
    Examples:
    | Firstname | Lastname | Billingaddress | creditcardno     | credittype |
    | vidhya    | E        | Adyar          | 1234567891012345 |  other     | 
    
 @smoke  
    Scenario Outline: user personal valid credentials
    Given user can enter card details 
    When i should enter card details "<expirydate>" and "<expiryyr>" 
    And i should enter "<cvvno>" 
    And i should click booknow button
    
    Examples:
    | expirydate | expiryyr | cvv |
    | june       | 2022     | 539 |
    
   @reg
  Scenario Outline: user personal valid credentials
    Given user is on hotel booking page
    When i should enter payment deatils "<Firstname>" and "<Lastname>" and "<Billingaddress>" and "<creditcardno>" and "<creditcardtype>"
    
    Examples:
    | Firstname | Lastname | Billingaddress | creditcardno     | credittype |
    | vidhya    | E        | ecr            | 1234567891012345 |  other     | 
    
 @reg 
    Scenario Outline: user personal valid credentials 
    When i should enter card details "<expirydate>" and "<expiryyr>" 
    And i should enter "<cvvno>" 
    And i should click booknow button
    
    Examples:
    | expirydate | expiryyr | cvv |
    | July       | 2021     | 467 |
    
    @sanity
  Scenario Outline: user personal valid credentials
    Given user is on hotel booking page
    When i should enter payment deatils "<Firstname>" and "<Lastname>" and "<Billingaddress>" and "<creditcardno>" and "<creditcardtype>"
    
    Examples:
    | Firstname | Lastname | Billingaddress | creditcardno     | credittype |
    | vidhya    | E        | chennai        | 1234567891012345 |  other     | 
    
 @sanity 
    Scenario Outline: user personal valid credentials 
    When i should enter card details "<expirydate>" and "<expiryyr>" 
    And i should enter "<cvvno>" 
    And i should click booknow button
    
    Examples:
    | expirydate | expiryyr | cvv |
    | June       | 2021     | 871 |