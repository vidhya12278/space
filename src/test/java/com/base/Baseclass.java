package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass 
{
	public static WebDriver driver;
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\cucumber\\drivers\\chromedriver.exe");
		return driver=new ChromeDriver();
	}
	
	public static void openurl(String url) 
	{
		driver.get(url);
    }
	
	public static void maximize() 
	{
	driver.manage().window().maximize();
	}
	
	public String geturl() 
	{
		return driver.getCurrentUrl();
    }
	
	public String gettitle() 
	{
		return driver.getTitle();
	}
	
	public static void type(WebElement t,String data) 
	{
		t.sendKeys(data);
    }
	
	public void buttonclick(WebElement t)
	{
		t.click();
    }
	
	public void cleartext(WebElement i) 
	{
		i.clear();
		
	}
	
	public boolean radiobutton(WebElement u)
	{
		return u.isSelected();
	}
	
	public String gettext(WebElement u)
	{
		return u.getText();
    }
	
	public static String getattribute(WebElement u) 
	{
		return u.getAttribute("value");
    }
	
	public void typejs(WebElement y,String text) 
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('value','"+text+"')", y);
	}
	
	public void buttonclickjs(WebElement y) 
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click()", y);
    }
	
	public String getattributejs(WebElement o) 
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Object t = j.executeScript("return arguments[0].getAttribute('value')", o);
		String f=(String)t;
		System.out.println(f);
		return f;
	}
	
	public void scrolldown(WebElement y) 
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",y);
	}
	
	public void highlight(WebElement p) 
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','background:yellow');",p);
	}
	public void highlightweb(WebElement p) 
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','background:blue');",p);
	}
	
	public void Actionssend(WebElement t,String text)
	{
	Actions j=new Actions(driver);
	j.sendKeys(t,text).perform();
    }
	public void refreshpage() 
	{
		driver.navigate().refresh();
    }
	
	public void navigate(String url) 
	{
		driver.navigate().to(url);
    }
	
	public void takescreenshot(WebElement t) throws IOException 
	{
		File s = t.getScreenshotAs(OutputType.FILE);
		File b= new File("C:\\cucumber\\screenshots\\ordernopage.jpeg");
		FileUtils.copyFile(s,b);
	}
	public boolean displayed(WebElement g) 
	{
		return g.isDisplayed();
    }
	public boolean enabled(WebElement g)
	{
		return g.isEnabled();
	}
	

}
