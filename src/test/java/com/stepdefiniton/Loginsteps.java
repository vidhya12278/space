package com.stepdefiniton;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import com.base.Baseclass;
import com.hotel.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Loginsteps extends Baseclass
{
	Maintainpage maintain;
	Loginpagepojo login;
	Searchpagepojo search;
	Bookingpagepojo booking;
	Orderpagepojo order;
	static WebDriver driver;
     @Given("user is on hotel page")
	  public void user_is_on_hotel_page() 
	   {
		driver=getDriver();
		openurl("http://adactinhotelapp.com/");
		maximize();
		System.out.println(geturl());
		System.out.println(gettitle());
       }

      @When("i should enters {string} and {string}")
	   public void i_should_enters_and(String string, String string2) 
       {
		System.out.println("==============login details=============");
		maintain=new Maintainpage();
		login=maintain.getLogin();
	
		WebElement u = login.getUser();
		type(u,string);
		System.out.println("username : " + getattribute(u));
		//Assert.assertEquals("verify username","vidhyaes",getattribute(u));
		WebElement p = login.getPass();
		type(p,string2);
		System.out.println("password : " + getattribute(p));
		//Assert.assertEquals("verify password", "vid@98",getattribute(p));
       }

	@When("i should click the login button")
	public void i_should_click_the_login_button() 
	{
		buttonclick(login.getLoginbutton());
	}
	
	@Given("user is on hotel search page")
	public void user_is_on_hotel_search_page() 
	{
	 System.out.println("================search page details=================");  
	}

	@When("i should enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void i_should_enter_and_and_and_and_and_and_and(String loc, String hotel, String string3, String r, String datein, String string6, String adult, String child) throws InterruptedException 
	{
		maintain=new Maintainpage();
		search =maintain.getSearch();
		Thread.sleep(8000);
	    WebElement l = search.getLoc();
	    type(l,loc);
	    System.out.println("location : " + getattribute(l));
	    WebElement h = search.getHotel();
	    type(h,hotel);
	    System.out.println("hotels : " + getattribute(h));
	    WebElement r1 = search.getRoomtype();
	    r1.sendKeys("standard");
	    System.out.println("roomtype : " + getattribute(r1));
	    WebElement n = search.getRoomno();
	    typejs(n,r);
	    System.out.println("room no : " + getattribute(n));
	    Thread.sleep(2000);
	    
	    WebElement d=  search.getDatein();
	    d.clear();
	    type(d,datein);
	    System.out.println("date in : " + getattribute(d));
	    Thread.sleep(1000);
	    WebElement o = search.getDateout();
	    o.clear();
	    o.sendKeys("05/07/2020");
	    //typejs(o,dateout); 
	    System.out.println("date out : " + getattribute(o));
	    WebElement a = search.getAdult();
	    typejs(a,adult);
	    System.out.println("adult room : " + getattribute(a));
	    WebElement c1 = search.getChild();
	    typejs(c1,child);
	    System.out.println("child room : " + getattribute(c1));
     }

	@When("i should click search button")
	public void i_should_click_search_button() throws InterruptedException 
	{
		buttonclick(search.getSubmit());
		 Thread.sleep(2000);
		 buttonclick(search.getRadio());
		 buttonclick(search.getCon());
     }

	
	@Given("user is on hotel booking page")
	public void user_is_on_hotel_booking_page() 
	{
		System.out.println("==============hotel booking page============");
	}
	

	@When("i should enter payment deatils {string} and {string} and {string} and {string} and {string}")
	public void i_should_enter_payment_deatils_and_and_and_and(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==============payment process============");
		maintain=new Maintainpage();
	    booking = maintain.getBooking();
		
	    WebElement first = booking.getFirst();
	    type(first,string);
	    System.out.println("firstname : " + getattribute(first));
	    WebElement last = booking.getLast();
	    last.sendKeys("E");
	    System.out.println("lastname : " + getattribute(last));
	    WebElement add = booking.getAdd();
	    type(add,string3);
	    System.out.println("address : " + getattribute(add));
	    WebElement ccn = booking.getCcn();
	    type(ccn,string4);
	    System.out.println("creditcard no : " + getattribute(ccn));
	    Thread.sleep(2000);
	    
	    WebElement cct = booking.getCct();
	    cct.sendKeys("other");
	    System.out.println("creditcard type : " + getattribute(cct));
}
	
	@When("i should enter card details {string} and {string}")
	public void i_should_enter_card_details_and(String string, String string2) 
	{
		maintain=new Maintainpage();
	    booking = maintain.getBooking();
		
		 WebElement cce = booking.getCce();
		 cce.sendKeys("May");
		// type(cce,string);
		 System.out.println("expiry month : " + getattribute(cce));
		 WebElement ccyr = booking.getCcyr();
		 ccyr.sendKeys("2022");
		 //type(ccyr,string2);
		 System.out.println("expiry year : "+ getattribute(ccyr));
   }

	@When("i should enter {string}")
	public void i_should_enter(String string) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement ccv = booking.getCcv();
		ccv.sendKeys("567");
		System.out.println("cvv no : " + getattribute(ccv));
    }

	@When("i should click booknow button")
	public void i_should_click_booknow_button() throws InterruptedException 
	{
		buttonclick(booking.getBookbutton());
		System.out.println("=================order no genearte===============");
		maintain=new Maintainpage();
		order = maintain.getOrder();
		Thread.sleep(8000);
		WebElement order1 = order.getOrder();
		System.out.println("order no : " + getattribute(order1));
		System.out.println("=================final booking details===============");
		List<WebElement> booking = driver.findElements(By.xpath("//input[@class='disable_text']"));
		  for (WebElement y : booking) 
		  {
			 System.out.println(getattribute(y));
			 //highlight(y);
		  }
		  Thread.sleep(5000);
		  //driver.quit();

	}

	








}
