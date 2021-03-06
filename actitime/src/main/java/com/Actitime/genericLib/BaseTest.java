package com.Actitime.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;

import com.Actitime.genericLib.FileLib;
import com.Actitime.genericLib.WebDriverCommonLib;

public class BaseTest implements IAutoConsts {
	public static WebDriver driver=null;
	
	
	@BeforeClass
	    public void openBrowser() throws Throwable
		{
			FileLib flib=new FileLib();
			String browser=flib.getPropKeyValue(PROP_PATH, "browser");
			if(browser.equals("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
				driver=new ChromeDriver();
				
			}
			
			else if(browser.equals("firefox"))
			
			{
				System.setProperty(GECKO_KEY, GECKO_VALUE);
				FirefoxOptions op=new FirefoxOptions();
				op.addArguments("--disable-notifications");
				driver=new FirefoxDriver();
					
			}
			
			 String appUrl = flib.getPropKeyValue(PROP_PATH, "url");
			 driver.get(appUrl);
			  WebDriverCommonLib wlib=new WebDriverCommonLib();
			  wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROP_PATH, "logintitle"), "Login Page");
		}
		
			public void tearDown()
			{
				driver.quit();
			}
			

		}



