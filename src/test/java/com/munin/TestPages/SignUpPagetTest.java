package com.munin.TestPages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.munin.TestBase.TestBase;
import com.munin.pageObject.SignUpPage;

public class SignUpPagetTest extends TestBase
{
	SignUpPage signup;
	
	@BeforeClass
	public void Initialization()
	{
		getBrowser("chrome");
		signup=new SignUpPage(driver);
	}
	
	/*@Test
	public void SignupPgeTest()
	{
		signup.CreateAccount();
	}*/
	
	
	@Test
	public void SearchForCheeseTest()
	{
		signup.SearchForCheese();
		String actualTitle = driver.getTitle();
		System.out.println("Title="+actualTitle);
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}



}
