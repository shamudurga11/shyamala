package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.genericLib.BaseTest;
import com.Actitime.genericLib.FileLib;
import com.Actitime.genericLib.WebDriverCommonLib;

public class AddNewProjectPage extends BaseTest {
	@FindBy(name="customerId")private WebElement custDD;
	@FindBy(name="name")private WebElement prjnametb;
	@FindBy(name="createProjectSubmit")private WebElement createprjbtn;
    
	public void AddNewProjectPage()
	{
	PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void selectCust() throws IOException, Throwable
	{  FileLib flib=new FileLib();
	   WebDriverCommonLib wlib=new WebDriverCommonLib();
	   wlib.selectOption(custDD,flib.getCellData(EXCEL_PATH, "customers", 0, 0));
		
	}
	public void prjName()
	{
		prjnametb.sendKeys("Busy Bits");
	}
	public void clickCreatePrj()
	{
		createprjbtn.click();
	}
	
	
}
