package com.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Orderpagepojo extends Baseclass
{

public Orderpagepojo()
{
PageFactory.initElements(driver, this);	
}

@FindBy(id="order_no")
private WebElement order;



public WebElement getOrder() {
	return order;
}
}
