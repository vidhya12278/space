$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Hotel.feature");
formatter.feature({
  "name": "verifying adactin hotel user details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verifying user details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on hotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "i should enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "i should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "i should enter \"\u003cLocation\u003e\" and \"\u003chotels\u003e\" and \"\u003cRoomtype\u003e\" and \"\u003cnoofrooms\u003e\" and \"\u003ccheckindate\u003e\" and \"\u003ccheckoutdate\u003e\" and \"\u003cadult\u003e\" and \"\u003cchild\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i should click search button",
  "keyword": "And "
});
formatter.step({
  "name": "i should enter payment deatils \"\u003cFirstname\u003e\" and \"\u003cLastname\u003e\" and \"\u003cBillingaddress\u003e\" and \"\u003ccreditcardno\u003e\" and \"\u003ccreditcardtype\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i should enter card details \"\u003cexpirydate\u003e\" and \"\u003cexpiryyr\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i should enter \"\u003ccvvno\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "i should click booknow button",
  "keyword": "And "
});
formatter.step({
  "name": "get orderno",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Location",
        "hotels",
        "roomtype",
        "noofrooms",
        "checkindate",
        "checkoutdate",
        "adult",
        "child",
        "Firstname",
        "Lastname",
        "Billingaddress",
        "creditcardno",
        "credittype",
        "expirydate",
        "expiryyr",
        "cvv"
      ]
    },
    {
      "cells": [
        "vidhyaes",
        "vid@98",
        "London",
        "HotelCreek",
        "Standard",
        "1 - One",
        "04/07/2020",
        "09/07/2020",
        "1 - One",
        "1 - One",
        "vidhya",
        "E",
        "Adyar",
        "1234567891012345",
        "other",
        "May",
        "2022",
        "568"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying user details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "Hotelpage.user_is_on_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should enters \"vidhyaes\" and \"vid@98\"",
  "keyword": "When "
});
formatter.match({
  "location": "Hotelpage.i_should_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Hotelpage.i_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should enter \"London\" and \"HotelCreek\" and \"\u003cRoomtype\u003e\" and \"1 - One\" and \"04/07/2020\" and \"09/07/2020\" and \"1 - One\" and \"1 - One\"",
  "keyword": "And "
});
formatter.match({
  "location": "Hotelpage.i_should_enter_and_and_and_and_and_and_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should click search button",
  "keyword": "And "
});
formatter.match({
  "location": "Hotelpage.i_should_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should enter payment deatils \"vidhya\" and \"E\" and \"Adyar\" and \"1234567891012345\" and \"\u003ccreditcardtype\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "Hotelpage.i_should_enter_payment_deatils_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should enter card details \"May\" and \"2022\"",
  "keyword": "And "
});
formatter.match({
  "location": "Hotelpage.i_should_enter_card_details_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should enter \"\u003ccvvno\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "Hotelpage.i_should_enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i should click booknow button",
  "keyword": "And "
});
formatter.match({
  "location": "Hotelpage.i_should_click_booknow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get orderno",
  "keyword": "And "
});
formatter.match({
  "location": "Hotelpage.get_orderno()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify message",
  "keyword": "Then "
});
formatter.match({
  "location": "Hotelpage.user_should_verify_message()"
});
formatter.result({
  "status": "passed"
});
});