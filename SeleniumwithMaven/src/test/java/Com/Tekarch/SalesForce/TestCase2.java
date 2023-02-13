package Com.Tekarch.SalesForce;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import Com.Tekarch.Utility.PropertiesUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 extends BasicTest{
	
	public static void TC2() throws InterruptedException {
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		
		String expected = "Home";
		
		getBrowser(url);
		
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);*/
	
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, uname, "User i.d");
		
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwd, "Password");
		
		
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login Button");
		
		Thread.sleep(6000);
		
		WebElement home = driver.findElement(By.id("home_Tab"));
		
		validate(home, expected,"HomePage");
	
		close();
		
	}

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		TC2();

	}

}
