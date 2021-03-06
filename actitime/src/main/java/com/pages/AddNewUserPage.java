package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.genericLib.BaseTest;

public class AddNewUserPage {
	
	@FindBy(name="username")private WebElement untb;
	@FindBy(name="passwordText")private WebElement pwdtb;
	@FindBy(name="passwordTextRetype")private WebElement rpwdtb;
	@FindBy(name="firstName")private WebElement fntb;
	@FindBy(name="lastName")private WebElement lntb;
	@FindBy(xpath="//input[@value='   Create User   ']")private WebElement createuserbtn;
	
	
	public AddNewUserPage()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public void addnewuser(String un,String pwd,String rpwd,String fn,String ln)
	{
	untb.sendKeys(un);
	pwdtb.sendKeys(pwd);
	rpwdtb.sendKeys(rpwd);
	fntb.sendKeys(fn);
	lntb.sendKeys(ln);
	createuserbtn.click();
	}
	
		


}
