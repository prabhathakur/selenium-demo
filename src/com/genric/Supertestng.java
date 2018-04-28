package com.genric;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.XmlTest;

public class Supertestng {
	public WebDriver driver;
	@BeforeMethod
	public void precondition(XmlTest x)
	
	{
		 String browsername = x.getParameter("browser");
		 if(browsername.equals("GC"))
		 {
			System.setProperty("webdriver.chrome.driver","./Exe/chromedriver.exe");
			driver = new ChromeDriver();
		 }
		 else if(browsername.equals("FF"))
		 {
			 System.setProperty("webdriver.gecko.driver","./Exe/geckodriver.exe");
				driver = new FirefoxDriver();
		 }
		 else
		 {
			 System.setProperty("webdriver.ie.driver","./Exe/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		
	}
	@AfterMethod
	public void postcondition()
	{
	//	driver.close();
		
	}

}
