package com.munin.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{

	public WebDriver driver;
	
	public void getBrowser(String browser)
	{
		if(System.getProperty("os.name").contains("Window"))
		{
			if(browser.equalsIgnoreCase("firefox"))
			{
				//https://github.com/mozilla/geckodriver/releases
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				//https://chromedriver.storage.googleapis.com/index.html
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
				
				
				ChromeOptions options=new ChromeOptions();
				options.setHeadless(true);
				
				
				
				driver = new ChromeDriver(options);
			}
		}
		else if(System.getProperty("os.name").contains("Mac")){
			System.out.println(System.getProperty("os.name"));
			if(browser.equalsIgnoreCase("firefox")){
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
				driver = new ChromeDriver();
			}
		}
		
		driver.manage().window().maximize();
		//driver.get("http://13.71.162.88:8085/");
		
		driver.get("https://www.google.com/");
			
	}
	
	public static void main(String[] args) 
	{
		TestBase test=new TestBase();
		test.getBrowser("chrome");
		
	}



}
