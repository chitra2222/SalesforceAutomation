package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.Tekarch.Utility.PropertiesUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected = "Please enter your password.";
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = "";

		getBrowser(url);
		
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, uname, "User i.d");
		
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwd, "User i.d");

		
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login Button");
		
		Thread.sleep(4000);
		
		WebElement errormsg = driver.findElement(By.id("error"));
		
		validate(errormsg, expected,"ErrorPage");

		
		close();

	}

}
