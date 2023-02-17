package com.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Basepage;

public class Homepage extends Basepage{
	
	public WebDriver driver;
	
	By acceptButton = By.cssSelector("#onetrust-accept-btn-handler");

	public Homepage() throws IOException {
		super();
		
	}
	
	public WebElement getAcceptButton() throws IOException
	{
		this.driver = getDriver();
		return driver.findElement(acceptButton);
	}
}
