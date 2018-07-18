package TestBasee;


import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import util.ConfigReader;
import util.Driverr;



public class TestBasee {

	
	
	protected WebDriver driver;
	// @prameters  --> means that this method will expect an argument
	// from the xml file
	// name of the parameter in the xml file is browser
	// @optional --> we use this if we dont want to
	// provide paramters in xml all the time


	@BeforeMethod
	public void setUp() {
		driver = Driverr.getDriver();
		driver.get(ConfigReader.getProperty("url"));
	}

	@AfterMethod
	public void tearDown() {
		Driverr.closeDriver();
	}

	
	
	
}
