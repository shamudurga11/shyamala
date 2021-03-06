package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.genericLib.BaseTest;


public class LoginPage {
	
	@FindBy(name="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwdtb;
	@FindBy(xpath="//input[@type='submit']") private WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void login(String un,String pwd)
	{
		untb.sendKeys("admin");
		pwdtb.sendKeys("manager");
		loginbtn.click();
	}

}
