package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Jvmreport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.hotel"},monochrome=true,dryRun=false,plugin= {"json:src\\test\\resources\\Reports\\adactin.json"})
public class HotelRunner {
	@AfterClass
	public static void afterclass() {
		Jvmreport.generate(System.getProperty("user.dir"+"src\\test\\resources\\Reports\\adactin.json"));

	}

}
