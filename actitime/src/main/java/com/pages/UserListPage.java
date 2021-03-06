package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.Actitime.genericLib.BaseTest;

public class UserListPage {
	@FindBy(xpath="//input[@value='Add New User']")private WebElement newusertb;
	@FindBy(className="successmsg")private WebElement successmsg;
	
	
	public UserListPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickNewUser()
	{
		newusertb.click();
	}
	public WebElement getSucceessMsg()
	{
		return successmsg;
	}
	public String getmsg()
	{
		return successmsg.getText();
	}
	
	

}
