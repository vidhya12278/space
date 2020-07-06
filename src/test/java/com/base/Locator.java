package com.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends Baseclass
{
public static boolean main(String[] args) 
{
	try 
	{
    List<WebElement> edition = driver.findElements(By.xpath("//button[@type='button']"));
    WebElement edit = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
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
}
