package packages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import util.BrowUtill;
import util.Driverr;

public class LognPagess {


public LognPagess() {
	
	
PageFactory.initElements(Driverr.getDriver(), this);	
}


@FindBy(id = "ctl00_MainContent_username")
public WebElement userName;

@FindBy(id = "ctl00_MainContent_password")
public WebElement password;

@FindBy(id = "ctl00_MainContent_login_button")
public WebElement loginButton;

@FindBy(id = "ctl00_MainContent_status")
public WebElement invalidUserNameErrMsg;

public void login(String uid, String pwd) {
	userName.sendKeys(uid);
	password.sendKeys(pwd);
	BrowUtill.waitForClickablility(loginButton, 2);
	loginButton.click();
	
}
}