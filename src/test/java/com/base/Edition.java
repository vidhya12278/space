package com.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Edition extends Baseclass
{

	public static boolean editpresent()
	{
		try 
		{
	    List<WebElement> edition = driver.findElements(By.xpath("//span[@class='lng']"));
	    WebElement edit = driver.findElement(By.xpath("//span[@class='lng']"));
	    if(edition.size()!=0 && edit.isDisplayed())
	    	System.out.println("element present");
	    return true;
	    } 
		catch (Exception e) 
		{
			System.out.println("element not present");
			return false;
		}
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		getDriver();
		openurl("https://www.aircanada.com/ca/en/aco/home.html#/");
		maximize();
		Pojo r=new Pojo();
	
		if(editpresent())
		{
			r.buttonclick(r.getEn());
		}
	}
	
}
