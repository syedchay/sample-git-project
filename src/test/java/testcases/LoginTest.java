package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;
import utilities.ExcelReader;

public class LoginTest extends BaseTest {
	
	
	
	@Test(dataProviderClass = DataUtil.class, dataProvider="dp")
	public void loginTest(String username, String password) {
		
		//comment1
		//comment2
		//comment3
		//comment4
		type("username_ID",username);
		click("nextBtn_XPATH");
	
	}
	
	


}
