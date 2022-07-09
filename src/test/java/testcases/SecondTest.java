package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class SecondTest extends BaseTest {
	
	
	@Test(dataProviderClass = DataUtil.class, dataProvider="dp")
	public void secondTest(String firstName, String lastName) {
		
		System.out.println(firstName+"---"+lastName);
	}
	
	

	

}
