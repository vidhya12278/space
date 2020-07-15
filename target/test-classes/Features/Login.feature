@func1

Feature: verifying adactin hotel search details
@smoke
  Scenario Outline: valid credentials
    Given user is on hotel search page
    When i should enter "<Location>" and "<hotels>" and "<Roomtype>" and "<noofrooms>" and "<checkindate>" and "<checkoutdate>" and "<adult>" and "<child>"
    And i should click search button
    
    Examples:
    | Location    | hotels         | roomtype     | noofrooms | checkindate | checkoutdate | adult   | child   | 
    | London      | HotelCreek     | Standard     | 1 - One   | 04/07/2020  | 09/07/2020   | 1 - One | 1 - One |
    
    @reg
    Scenario Outline: valid credentials
    Given user is on hotel search page
    When i should enter "<Location>" and "<hotels>" and "<Roomtype>" and "<noofrooms>" and "<checkindate>" and "<checkoutdate>" and "<adult>" and "<child>"
    And i should click search button
    
    Examples:
    | Location    | hotels         | roomtype     | noofrooms | checkindate | checkoutdate | adult   | child   | 
    | London      | HotelCreek     | Standard     | 1 - One   | 04/07/2020  | 09/07/2020   | 1 - One | 1 - One |
    
    @sanity
    Scenario Outline: valid credentials
    Given user is on hotel search page
    When i should enter "<Location>" and "<hotels>" and "<Roomtype>" and "<noofrooms>" and "<checkindate>" and "<checkoutdate>" and "<adult>" and "<child>"
    And i should click search button
    
    Examples:
    | Location    | hotels         | roomtype     | noofrooms | checkindate | checkoutdate | adult   | child   | 
    | London      | HotelCreek     | Standard     | 1 - One   | 04/07/2020  | 09/07/2020   | 1 - One | 1 - One |
    
