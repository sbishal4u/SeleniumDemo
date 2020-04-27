package com.munin.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage 
{
public WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn-link btn-link__signup")
	WebElement signUp;
	
	@FindBy(xpath="//input[@id='Input_Email']")
	WebElement inputEmail;
	
	@FindBy(xpath="//input[@id='Input_Password']")
	WebElement inputPassword;
	
	@FindBy(xpath = "//input[@id='Input_ConfirmPassword']")
	WebElement inputConfirmPassword;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-lg rounded-pill float-lg-right')]")
	WebElement signUp1;
	
	/**************************************************/
	
	/***********google************************/
	
	@FindBy(xpath = "//input[@name='q']")
	WebElement text;

	
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	public void CreateAccount()
	{
		inputEmail.sendKeys("mukesh612@yopmail.com");
		inputPassword.sendKeys("mukesh@1234665");
		inputConfirmPassword.sendKeys("mukesh@1234665");
		signUp1.click();
	}
	
	public void SearchForCheese()
	{
		text.sendKeys("Cheese");
		text.sendKeys(Keys.ENTER);
	}


}
