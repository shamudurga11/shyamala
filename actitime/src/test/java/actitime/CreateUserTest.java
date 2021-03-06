package actitime;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Actitime.genericLib.BaseTest;
import com.Actitime.genericLib.FileLib;
import com.Actitime.genericLib.WebDriverCommonLib;
import com.pages.AddNewUserPage;
import com.pages.LoginPage;
import com.pages.OpenTasksPage;
import com.pages.UserListPage;

public class CreateUserTest extends BaseTest {
	
	@Test
	
	public void createUser() throws Throwable
	{   FileLib flib=new FileLib();
		LoginPage lp=new LoginPage();
		lp.login(flib.getPropKeyValue(PROP_PATH, "username"),flib.getPropKeyValue(PROP_PATH, "password"));
		
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.getPropKeyValue(PROP_PATH, "opentaskstitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROP_PATH, "opentaskstitle"), "Open Tasks Page");
		OpenTasksPage otp=new OpenTasksPage();
		otp.clickCreateUsertb();
		
		wlib.waitForPageTitle(flib.getPropKeyValue(PROP_PATH, "userlisttitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROP_PATH, "userlisttitle"), "User List Page");
		UserListPage ulp=new UserListPage();
		ulp.clickNewUser();
		
		wlib.waitForPageTitle(flib.getPropKeyValue(PROP_PATH, "addnewusertitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROP_PATH, "addnewusertitle"), "Add new User Page");
		
		AddNewUserPage anup=new AddNewUserPage();
		anup.addnewuser(flib.getCellData(EXCEL_PATH, "users", 0, 1), 
				flib.getCellData(EXCEL_PATH, "users", 1, 1), 
				flib.getCellData(EXCEL_PATH, "users", 2, 1), 
				flib.getCellData(EXCEL_PATH, "users", 3, 1), 
				flib.getCellData(EXCEL_PATH, "users", 4, 1));
		if(ulp.getSucceessMsg().isDisplayed())
		{
			Reporter.log("User is created,Success message is displayed",true);
		}
		else
		{
			Reporter.log("User is  not created,Success message is not displayed",true);
		}
		
		
		
		
		
		
	}
	

}
