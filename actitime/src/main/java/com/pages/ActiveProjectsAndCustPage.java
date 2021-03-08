package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.genericLib.BaseTest;

public class ActiveProjectsAndCustPage {
	
	@FindBy(xpath="//input[@value='Add New Customer']")private WebElement addcusttb;
	@FindBy(xpath="//input[@value='Add New Project']")private WebElement addprjtb;
	public void ActiveProjectAndCustPage()
	{
	  PageFactory.initElements(BaseTest.driver, this);	
	}
	public void clickAddCust()
	{
		addcusttb.click();
	
	}
	//create          
	
	public void clickAddPrj()
	{
		addprjtb.click();
		
	}
	

}
