package packages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Driverr;

public class ProductsPagess {

	
	public ProductsPagess() {
		
	PageFactory.initElements(Driverr.getDriver(), this);	
		
	}
	

	@FindBy(xpath="//table[@class='ProductsTable']/tbody/tr/td[1]")
	public List<WebElement> productNames;
	
	@FindBy(xpath="//table[@class='ProductsTable']/tbody/tr")
	public List<WebElement> productsRows;	
	
	
	
	
	
}
