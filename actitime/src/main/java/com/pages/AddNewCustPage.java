package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.genericLib.BaseTest;

public class AddNewCustPage {
	
	@FindBy(name="name")private WebElement custtb;
	@FindBy(name="createCustomerSubmit")private WebElement createcusttb;
    public void AddNewCustPage()
    {
    	PageFactory.initElements(BaseTest.driver, this);
    }
    public void custName()
    {
    	custtb.sendKeys("Dharma");
    }
   
    public void clickCreateCust()
    {
    	createcusttb.click();
    }
}
