package com.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Bookingpagepojo extends Baseclass
{

public Bookingpagepojo() 
{
	PageFactory.initElements(driver, this);
}

@FindBy(id="first_name")
private WebElement first ;

@FindBy(id="last_name")
private WebElement last;

@FindBy(id="address")
private WebElement add;

@FindBy(id="cc_num")
private WebElement ccn;

@FindBy(id="cc_type")
private WebElement cct;

@FindBy(id="cc_exp_month")
private WebElement cce;

@FindBy(id="cc_exp_year")
private WebElement ccyr;

@FindBy(id="cc_cvv")
private WebElement ccv;

//click booknow button

@FindBy(id="book_now")
private WebElement bookbutton;

public WebDriver getDriver() {
	return driver;
}

public WebElement getFirst() {
	return first;
}

public WebElement getLast() {
	return last;
}

public WebElement getAdd() {
	return add;
}

public WebElement getCcn() {
	return ccn;
}

public WebElement getCct() {
	return cct;
}

public WebElement getCce() {
	return cce;
}

public WebElement getCcyr() {
	return ccyr;
}

public WebElement getCcv() {
	return ccv;
}

public WebElement getBookbutton() {
	return bookbutton;
}


}
