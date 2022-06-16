package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mobPackage.base;

public class OrderPage extends base
{
public WebDriver driver;
	
	
	public  OrderPage(WebDriver driver) {
		this.driver=driver;
	}
  By Fn = By.id("inputFirstName");
  By Ln = By.xpath("(//*[@id='inputFirstName'])[2]");
  By Em= By.id("inputEmail");
  By pwd= By.id("inputPassword");
  By Ra= By.id("flexRadioDefault2");
  By ph= By.xpath("//*[@placeholder='00000000000']");
  By Ad1= By.id(" address1");
  By Ad2= By.id("address2");
  By cy= By.id("inputCity");
  By Dp= By.id("inputState");
  By zp= By.id("inputZip");
  By Br= By.xpath("//*[.='Apple']");
  By Cn= By.cssSelector("input[placeholder='no of mobiles']");
  By ys= By.id("bought");
  By dep =By.xpath("//*[@id='gridCheck1']");
  By dep1 = By.xpath("(//*[@id='gridCheck1'])[2]");
  By su = By.xpath("//button[@class='btn btn-primary']");
  
  public WebElement FirstName()
  {
	  return driver.findElement(Fn);
  }
  public WebElement Lastname()
  {
	  return driver.findElement(Ln);
  }
  public WebElement Email()
  {
	  return driver.findElement(Em);
  }
  public WebElement Password()
  {
	  return driver.findElement(pwd);
  }
  public WebElement Radio() {
		
		return driver.findElement(Ra);
	}
  public WebElement Phone() {
		
		return driver.findElement(ph);
	}
  public WebElement Address1() {
		
		return driver.findElement(Ad1);
	}
  public WebElement Address2() {
		
		return driver.findElement(Ad2);
	}
  public WebElement city() {
		
		return driver.findElement(cy);
	}
  public WebElement State() {
		
		 return driver.findElement(Dp);
		
	}
  public WebElement Zipcode() {
		
		 return driver.findElement(zp);
		 
	}
  public WebElement Brand() {
		
		 return driver.findElement(Br);
		 
	}
  public WebElement Count() {
		
		 return driver.findElement(Cn);
		 
	}
  public WebElement Haveyou() {
		
		 return driver.findElement(ys);
		 
	}
  public WebElement Check1() {
		
		 return driver.findElement(dep);
		 
	}
  public WebElement Check2() {
		
		 return driver.findElement(dep1);
		 
	}
  public WebElement Sunmit() {
		
		 return driver.findElement(su);
		 
	}
}
