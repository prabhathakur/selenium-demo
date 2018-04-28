package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pw;
	
	@FindBy(id="loginButton")
	private WebElement login;
	


	public void login(String urn,String pwd)
	{
		un.sendKeys(urn);
		pw.sendKeys(pwd);
		login.click();
		
	
	}
	public void e()
	{
		driver.findElement(By.xpath(""));
		
		
	}
	
	
	
	
	
	
	
}
	
	
	
	
	

