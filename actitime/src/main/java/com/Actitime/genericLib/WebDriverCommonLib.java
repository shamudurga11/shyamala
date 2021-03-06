package com.Actitime.genericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest {
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	public void selectOption(WebElement addr,int index)
	{
		Select sel=new Select(addr);
		sel.selectByIndex(index);
	}
	public void selectOption(WebElement addr,String text)
	{
		Select sel=new Select(addr);
		sel.selectByVisibleText(text);
	}
	public void selectOption(String value,WebElement addr)
	{
		Select sel=new Select(addr);
		sel.selectByValue(value);
	}
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(String value)
	{
		driver.switchTo().frame(value);
		
	}
	public void switchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
    public void mouseHover(WebElement element)
    {
    	Actions ac=new Actions(driver);
    	ac.moveToElement(element);
    }
    public void waitForElementVisibility(WebElement element)
    {
    	WebDriverWait wait=new WebDriverWait(driver,60);
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForPageTitle(String title)
    {
    	WebDriverWait wait=new WebDriverWait(driver,60);
    	wait.until(ExpectedConditions.titleContains(title));
    }
    public void verifyPage(String actual,String expected,String pagename)
    {
    	Assert.assertEquals(actual, expected);
    	Reporter.log(pagename+"is displayed",true);
    }
    public void getPageScreenShot(String path) 
    {
    	TakesScreenshot s=(TakesScreenshot)driver;
    	File src=s.getScreenshotAs(OutputType.FILE);
    	File dest=new File(path);
    	try {
			Files.copy(src,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

}
