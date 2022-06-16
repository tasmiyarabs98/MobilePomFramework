package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
//	By Lates =By.id("navbarDropdown");
//	public WebElement latesOption()
//	{
//		return driver.findElement(Lates);
//	}
	By All=By.xpath("//a[.='All Mobiles']");
	By sr= By.id("myInput");
	By or= By.xpath("(//a[.='Order'])[4]");
	
	public WebElement AllMobile()
	{
		return driver.findElement(All);
	}
	public WebElement Search()
	{
		return driver.findElement(sr);
	}
	
	public WebElement order() {
		
		return driver.findElement(or);
	}

	
}
