package com.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Searchpagepojo extends Baseclass
{
public Searchpagepojo() 
{
PageFactory.initElements(driver,this);	
}

@FindBy(name="location")
private WebElement loc;

@FindBy(id="hotels")
private WebElement hotel;

@FindBy(id="room_type")
private WebElement roomtype ;

@FindBy(id="room_nos")
private WebElement roomno;

@FindBy(id="datepick_in")
private WebElement datein;

@FindBy(id="datepick_out")
private WebElement dateout;

@FindBy(id="adult_room")
private WebElement adult;

@FindBy(id="child_room")
private WebElement child;

//click buttons
@FindBy(id="Submit")
private WebElement submit;

@FindBy(id="radiobutton_0")
private WebElement radio;

@FindBy(id="continue")
private WebElement con;
public WebDriver getDriver() {
	return driver;
}

public WebElement getLoc() {
	return loc;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoomtype() {
	return roomtype;
}

public WebElement getRoomno() {
	return roomno;
}

public WebElement getDatein() {
	return datein;
}

public WebElement getDateout() {
	return dateout;
}

public WebElement getAdult() {
	return adult;
}

public WebElement getChild() {
	return child;
}

public WebElement getSubmit() {
	return submit;
}

public WebElement getRadio() {
	return radio;
}

public WebElement getCon() {
	return con;
}


}
