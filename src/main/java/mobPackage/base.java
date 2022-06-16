package mobPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{ 
	public WebDriver driver;
	public WebDriver intial() throws IOException
	{ 
		Properties pro = new Properties();
		FileInputStream Fs =  new FileInputStream("C:\\Users\\syedatasmiya.rabbani\\eclipse-workspace\\MobilePom\\src\\main\\java\\mobPackage\\Data.properties");
		pro.load(Fs);
		String br = pro.getProperty("browser");
		System.out.println(br);
		System.setProperty("webdriver.chrome.driver", "./driver2/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
