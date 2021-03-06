package actitime;

import org.testng.annotations.Test;

import com.Actitime.genericLib.BaseTest;
import com.Actitime.genericLib.FileLib;
import com.Actitime.genericLib.WebDriverCommonLib;
import com.pages.ActiveProjectsAndCustPage;
import com.pages.AddNewProjectPage;
import com.pages.LoginPage;
import com.pages.OpenTasksPage;

public class CreateProjectTest extends BaseTest {
	@Test
	public void createProject() throws Throwable
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
		apcp.clickAddPrj();
		
		wlib.waitForPageTitle(flib.getPropKeyValue(PROP_PATH, "addnewprojecttitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROP_PATH, "addnewprojecttitle"), "Add New Project Page");
		
		AddNewProjectPage anpp=new AddNewProjectPage();
		anpp.selectCust();
		anpp.prjName();
		anpp.clickCreatePrj();
	}





}
