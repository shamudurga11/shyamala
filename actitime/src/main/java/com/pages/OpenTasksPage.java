package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.genericLib.BaseTest;

public class OpenTasksPage {
	
	@FindBy(xpath="//a[text()='Users']") private WebElement user;
	@FindBy(xpath="//a[text()='Projects & Customers']")private WebElement custtb;
	
	public OpenTasksPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
		
	}
	public void clickCreateUsertb()
	{
		user.click();
	}
	public void clickPrjCust()
	{
		custtb.click();
	}

}
