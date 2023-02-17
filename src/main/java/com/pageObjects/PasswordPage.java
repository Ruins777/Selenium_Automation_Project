package com.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Basepage;

public class PasswordPage extends Basepage{
	
	public WebDriver driver;
	
	By passLink = By.cssSelector("[aria-haspopup] div:nth-of-type(1)");
	By passWord = By.cssSelector("#Password");
	By buttonClick = By.cssSelector(".button--outline");
	

	public PasswordPage() throws IOException {
		super();
	}
	
	public WebElement getPassLink() throws IOException
	{
		this.driver = getDriver();
		return driver.findElement(passLink);
	}
	
	public WebElement getPassWord() throws IOException
	{
		this.driver = getDriver();
		return driver.findElement(passWord);
	}
	
	public WebElement getButtonClick() throws IOException {
		this.driver=getDriver();
		return driver.findElement(buttonClick);
		
	}

}
