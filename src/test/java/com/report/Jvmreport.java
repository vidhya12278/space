package com.report;

import java.io.File;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {
	public static void generateJVMReport(String jsonFile) 
	{
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		Configuration con=new Configuration(loc,"adactin hotel Automate");
		con.addClassifications("Browser name","chrome");
		con.addClassifications("Browser version", "83");
		con.addClassifications("OS", "Windows 10");
		con.addClassifications("OS type", "64");
		con.addClassifications("Testing","Regression");
		
		List<String> jsonfiles=new ArrayList<String>();
		jsonfiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonfiles, con);
		builder.generateReports();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
