package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.JVMreport;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.hotel"},monochrome=true,dryRun=true,plugin= {"json:src\\test\\resources\\Reports\\adactin.json","rerun:src\\test\\resources\\Reports\\rerun.txt"},snippets=SnippetType.CAMELCASE, strict=true)
public class HotelRunner {
	/*@AfterClass
	public static void afterclass() {
		JVMreport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");

	}*/

}
