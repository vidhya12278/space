package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Baseclass
{
public Pojo() 
{
PageFactory.initElements(driver,this);
}


@FindBy(xpath="(//button[@type='button'])[1]")
private WebElement button ;

@FindBy(xpath="//input[@class='sr-only no-focus-ring glyph-hidden']")
private WebElement trip;

@FindBy(xpath="(//span[text()='English'])[2]")
private WebElement en;

public WebElement getEn() {
	return en;
}

public WebElement getButton() {
	return button;
}

public WebElement getTrip() {
	return trip;
}





















}
