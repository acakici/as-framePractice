package util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class Driverr {

	
	private Driverr() {
	}

	private static WebDriver driver;

	public static WebDriver getDriver(String browser) {

		if (driver == null) {
			// if the browser from the properties file
			// if no browser is passed
			browser = browser == null ? ConfigReader.getProperty("browser") : browser;

			switch (browser) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			}
		}
		return driver;
	}

	public static WebDriver getDriver() {
		return getDriver(null);
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
