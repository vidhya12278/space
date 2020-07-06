package com.stepdefiniton;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import com.base.Baseclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Loginsteps extends Baseclass
{
	WebDriver driver;
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
	public void i_should_enters_and(String name, String password) 
	{
		System.out.println("---------------------------------login details-------------------------------");
		WebElement user = driver.findElement(By.id("username"));
		 type(user,name);
		 System.out.println("username : " + getattribute(user));
		 WebElement pass = driver.findElement(By.id("password"));  
		 Actionssend(pass,password);
		 System.out.println("password : " + getattribute(pass));
	    }

	@When("i should click the login button")
	public void i_should_click_the_login_button() 
	{
		WebElement c = driver.findElement(By.id("login"));
		buttonclickjs(c);
	}

	@When("i should enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void i_should_enter_and_and_and_and_and_and_and(String string, String string2, String str, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	     System.out.println("--------------------------------hotel details-----------------------------------");
		WebElement loc = driver.findElement(By.id("location"));
	    type(loc,string);
	    System.out.println("location : " + getattribute(loc));
	    WebElement hotels = driver.findElement(By.id("hotels"));
	    type(hotels,string2);
	    Thread.sleep(2000);
	    System.out.println("hotel name : " +getattribute(hotels));
	    WebElement rom = driver.findElement(By.id("room_type"));
	    type(rom,str);
	    System.out.println("room type : " + getattribute(rom));
	    WebElement roomno = driver.findElement(By.id("room_nos"));
	    type(roomno,string4);
	    System.out.println("room nos : " + getattribute(roomno));
	    WebElement datein = driver.findElement(By.id("datepick_in"));
	    cleartext(datein);
	    type(datein,string5);
	    System.out.println("date check in :" + getattribute(datein));
	    WebElement dateout = driver.findElement(By.id("datepick_out"));
	    cleartext(dateout);
	    type(dateout,string6);
	    System.out.println("date check out : " + getattribute(dateout));
	    WebElement adult = driver.findElement(By.id("adult_room"));
	    type(adult,string7);
	    System.out.println("adult rooms : " + getattribute(adult));
	    WebElement child = driver.findElement(By.id("child_room"));
	    type(child,string8);
	    System.out.println("child rooms : " + getattribute(child));
	}

	@When("i should click search button")
	public void i_should_click_search_button() throws InterruptedException
	{
	   WebElement click = driver.findElement(By.id("Submit"));
	   buttonclickjs(click);
	   Thread.sleep(3000);
	   WebElement radio = driver.findElement(By.id("radiobutton_1"));
	   buttonclickjs(radio);
	   System.out.println("radio button is selected or not : " + radiobutton(radio));
	   driver.findElement(By.id("continue")).click();
	}

   @When("i should enter payment deatils {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void i_should_enter_payment_deatils_and_and_and_and_and_and_and(String string, String string2, String address, String string4, String string5, String string6, String string7, String string8) throws InterruptedException
   {
	   Thread.sleep(4000);
       System.out.println("---------------------------------payment details---------------------------------");
	   WebElement first = driver.findElement(By.id("first_name"));
	   typejs(first,string);
	   System.out.println("first name : " + getattribute(first));
	   WebElement last = driver.findElement(By.id("last_name"));
	   typejs(last,string2);
	   System.out.println("last name : " + getattribute(last));
	   Thread.sleep(2000);
	   WebElement add = driver.findElement(By.id("address"));
	   type(add,address);
	   System.out.println("biiling address : "+ getattribute(add));
	   
	   WebElement ccn = driver.findElement(By.id("cc_num"));
	   type(ccn,string4);
	   System.out.println("credit card no : " + getattribute(ccn));
	   WebElement credittype = driver.findElement(By.id("cc_type"));
	   type(credittype,string5);
	   System.out.println("credit card type : " + getattribute(credittype));
	   WebElement mon = driver.findElement(By.id("cc_exp_month"));
	   type(mon,string6);
	   System.out.println("expiry month : " + getattribute(mon));
	   WebElement yr = driver.findElement(By.id("cc_exp_year"));
	   type(yr,string7);
	   System.out.println("expiry date : " + getattribute(yr));
	   WebElement cvv = driver.findElement(By.id("cc_cvv"));
	   type(cvv,string8);
	   System.out.println("cvv no : " + getattribute(cvv));
  }

  @When("i should click booknow button")
  public void i_should_click_booknow_button() 
  {
	  WebElement book = driver.findElement(By.id("book_now")); 
	  buttonclickjs(book);
  }
  
  @When("get orderno")
  public void get_orderno() throws InterruptedException, IOException
  {
 Thread.sleep(8000);
  System.out.println("---------------------------order no-----------------------------");
  WebElement order = driver.findElement(By.id("order_no")); 
  System.out.println("order page url : " + geturl() );
  System.out.println("order page title : " + gettitle());
  scrolldown(order);
  System.out.println("order no : " + getattributejs(order));
  WebElement usershow = driver.findElement(By.xpath("//input[@id='username_show']"));
  highlight(usershow);
  WebElement title = driver.findElement(By.xpath("//td[@class='login_title']"));
  highlightweb(title);
  System.out.println("=============================booking details=========================");
  List<WebElement> booking = driver.findElements(By.xpath("//input[@class='disable_text']"));
  for (WebElement y : booking) 
  {
	 System.out.println(getattribute(y));
	 highlight(y);
  }
  Thread.sleep(5000);
  takescreenshot(order);
   }
  
  @When("navigate page")
  public void navigate_page() throws InterruptedException 
  {
   Thread.sleep(5000);
   WebElement log = driver.findElement(By.xpath("//input[@id='logout']"));
   buttonclickjs(log);
   refreshpage();
   navigate("http://adactinhotelapp.com/");
   //driver.navigate().to("http://adactinhotelapp.com/");
  }
  
@Then("user should verify message")
public void user_should_verify_message() 
{
	System.out.println("just verify all hotel details for booking ");   
 }
	







}
