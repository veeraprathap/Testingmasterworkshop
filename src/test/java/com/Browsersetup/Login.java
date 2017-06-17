package com.Browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	
	
	@Test
	
	public static void launchBrowser()
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

}
