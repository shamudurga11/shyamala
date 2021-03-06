package actitime;

import org.testng.annotations.Test;

import com.Actitime.genericLib.BaseTest;
import com.Actitime.genericLib.FileLib;
import com.Actitime.genericLib.WebDriverCommonLib;
import com.pages.ActiveProjectsAndCustPage;
import com.pages.AddNewCustPage;
import com.pages.LoginPage;
import com.pages.OpenTasksPage;

public class CreateCustomerTest extends BaseTest {
	
	@Test
	public void createCustomer() throws Throwable
	{
	FileLib flib=new FileLib();
	LoginPage lp=new LoginPage();
	lp.login(flib.getPropKeyValue(PROP_PATH, "username"),flib.getPropKeyValue(PROP_PATH, "password"));
	
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.waitForPageTitle(flib.getPropKeyValue(PROP_PATH, "opentaskstitle"));
	wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROP_PATH, "opentaskstitle"), "Open Tasks Page");
	
	OpenTasksPage otp=new OpenTasksPage();
	otp.clickPrjCust();
	wlib.waitForPageTitle(flib.getPropKeyValue(PROP_PATH, "activeprjstitle"));
	wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROP_PATH, "activeprjstitle"), "Active Projects & Customers Page");
	
	ActiveProjectsAndCustPage apcp=new ActiveProjectsAndCustPage();
	apcp.clickAddCust();
	wlib.waitForPageTitle(flib.getPropKeyValue(PROP_PATH, "addnewcusttitle"));
	wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROP_PATH, "addnewcusttitle"), "Add New Customer Page");
	
	AddNewCustPage ancp=new AddNewCustPage();
	ancp.custName();
	ancp.clickCreateCust();
	
	
	

	
	
	
	
	
	
	}
}
