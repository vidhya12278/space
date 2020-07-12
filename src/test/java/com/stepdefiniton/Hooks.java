package com.stepdefiniton;

import java.util.Date;

import com.base.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass
{
	 static Date d;
	@Before(order=3)
	public void beforescenario()
	{
		getDriver();
	}
	
	@Before(order=2)
	public void beforesecond() 
	{
		d=new Date();
		System.out.println(d);
    }
	
	@Before(order=1)
	public void beforefirst() 
	{
		System.out.println("scenario starts");
	}
	
	@After(order=1)
	public void afterfirst() 
	{
	System.out.println("scenario ends");	
    }
	
    @After(order=2)
	public void aftersecond() 
	{
		d=new Date();
		System.out.println(d);
    }
	
	@After(order=3)
	public void afterscenario(Scenario sc) 
	{
		if(sc.isFailed())
             {
			sc.embed(screenshot(),"image/png");
			}
		quit();
    }
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
