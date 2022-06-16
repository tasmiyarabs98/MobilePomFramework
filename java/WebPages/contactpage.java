package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mobPackage.base;

public class contactpage extends base
{
	
		public WebDriver driver;
		public contactpage(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//a[@id='navbarDropdown']")
		WebElement support;

		@FindBy(xpath="//a[text()='Contact Us']")
		WebElement contactus;

		@FindBy(xpath="//input[@name='name']")
		WebElement username;

		@FindBy(xpath="//input[@name='email']")
		WebElement email;

		@FindBy(xpath="//input[@type='tel']")
		WebElement phone;

		@FindBy(xpath="//textarea[@name='message']")
		WebElement message;

		@FindBy(xpath="//input[@value='Send']")
		WebElement button;

//		public WebElement contactus()
//		{
//		return contactus;
//		}

		public WebElement support() {
			
			return support;
		}

		public WebElement contactus() {
			
			return contactus;
		}

		public WebElement username() {
			
			return username;
		}

		public WebElement email() {
			
			return email;
		}

		public WebElement phone() {
			
			return  phone;
		}

		public WebElement message() {
			
			return message;
		}

		public WebElement button() {
			
			return button;
		}

}
