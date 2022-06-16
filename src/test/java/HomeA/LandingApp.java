package HomeA;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import WebPages.HomePage;
import WebPages.OrderPage;
import WebPages.contactpage;
import mobPackage.base;

public class LandingApp extends base
{
	public WebDriver driver;
	@Test(priority = 1)
	public void home_method() throws IOException, InterruptedException, AWTException
	{
		driver=intial();
		driver.get("https://mobileworld.azurewebsites.net/");
		HomePage Hp = new HomePage(driver);
		
//		Assert.assertTrue(Hp.latesOption().isDisplayed());
			Hp.AllMobile().click();
			Hp.Search().click();
			Hp.Search().sendKeys("Apple Iphone 13");
			Hp.order().click();	
	}
			@Test(priority = 2)
			public void Orderpa() throws Throwable
			{
			OrderPage R = new OrderPage(driver);
			Set<String> window = driver.getWindowHandles();		
			Iterator<String>it = window.iterator();
			Thread.sleep(2000);
			String parentId = it.next();
			String childId = it.next();
			driver.switchTo().window(childId);
			R.FirstName().sendKeys("syeda");
			R.Lastname().sendKeys("tasmiya");
			R.Email().sendKeys("xyz@gmail.com");
			R.Password().sendKeys("erft342");
			R.Radio().click();
			R.Phone().sendKeys("9876543212");
			R.Address1().sendKeys("syudwy ijqien ");
			R.Address2().sendKeys("dwaraka 5st floor");
			R.city().sendKeys("Bangalore");
//			R.State();
			Select sle= new Select(R.State());
			sle.selectByVisibleText("Karnataka");
			R.Zipcode().sendKeys("45637");
			R.Brand().click();
			R.Count().sendKeys("3");
			Select sle2= new Select(R.Haveyou());
			sle2.selectByValue("0");
			R.Check1().click();
			R.Check2().click();
			R.Sunmit().click();
			 Robot ro=new Robot();
			 for(int i=0;i<2;i++)
			 {
				 ro.keyPress(KeyEvent.VK_TAB);
			 }
			 ro.keyRelease(KeyEvent.VK_TAB);
			 ro.keyPress(KeyEvent.VK_ENTER);
			 ro.keyRelease(KeyEvent.VK_ENTER);
			 
			 Thread.sleep(2000);
			 
			 driver.close();
			 driver.switchTo().window(parentId);
			}
			@Test(priority = 3)
			public void contactus()
			{
			 contactpage contact = new contactpage(driver);
			 
			 contact.support().click();
			 contact.contactus().click();
			 Set<String> window2 = driver.getWindowHandles();
			 int no=window2.size();
			 System.out.println(no);
			 List<String> list= new ArrayList<String>(window2);
			 driver.switchTo().window(list.get(1));
			 contact.username().sendKeys("syeda");
			 contact.email().sendKeys("xyz@gmail.com");
			 contact.phone().sendKeys("987656789");
			 contact.message().sendKeys("its open in child browser");
			 contact.button().click();
			
			}
			
	}


