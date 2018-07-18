package LogTests;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



import TestBasee.TestBasee;
import packages.LognPagess;
import util.BrowUtill;
import util.ConfigReader;

public class LogTestess extends TestBasee{

	
	
	@Test()
	public void positiveloginTest() {

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		BrowUtill.waitFor(2);
	}

	@Test(priority = 2)
	public void positiveLoginUsingPOM() {
		LognPagess loginPage = new LognPagess();
		loginPage.userName.sendKeys(ConfigReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigReader.getProperty("password"));
		loginPage.loginButton.click();

	}

	@Ignore
	@Test(priority = 1, groups = "functest")
	public void invalidUsernameTest() {
		LognPagess loginPage = new LognPagess();
		loginPage.userName.sendKeys("invalid");
		loginPage.password.sendKeys("test");
		loginPage.loginButton.click();
		String errMsg = loginPage.invalidUserNameErrMsg.getText();

		assertEquals(errMsg, "Invalid Login or Password.");
	}

	
}
