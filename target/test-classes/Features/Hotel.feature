Feature: verifying adactin hotel user details
  Scenario Outline: verifying user details with valid credentials
    Given user is on hotel page
    When i should enters "<username>" and "<password>"
    And i should click the login button
    And i should enter "<Location>" and "<hotels>" and "<Roomtype>" and "<noofrooms>" and "<checkindate>" and "<checkoutdate>" and "<adult>" and "<child>"
    And i should click search button
    And i should enter payment deatils "<Firstname>" and "<Lastname>" and "<Billingaddress>" and "<creditcardno>" and "<creditcardtype>"
    And i should enter card details "<expirydate>" and "<expiryyr>" 
    And i should enter "<cvvno>" 
    And i should click booknow button
    And get orderno
    Then user should verify message
    
    Examples:
    | username | password | Location    | hotels         | roomtype     | noofrooms | checkindate | checkoutdate | adult   | child   | Firstname | Lastname | Billingaddress | creditcardno     | credittype | expirydate | expiryyr | cvv |
    | vidhyaes | vid@98   | London      | HotelCreek     | Standard     | 1 - One   | 04/07/2020  | 09/07/2020   | 1 - One | 1 - One | vidhya    | E        | Adyar          | 1234567891012345 |  other     | May        | 2022     | 568 |
    
    
