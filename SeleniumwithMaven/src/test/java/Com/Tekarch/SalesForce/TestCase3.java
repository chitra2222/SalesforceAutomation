package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.Tekarch.Utility.PropertiesUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected ="chitra@tekarch.com";
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		
		
		getBrowser(url);
		
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, uname,"User i.d");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwd ,"Password");

		
		WebElement remembercheck = driver.findElement(By.id("rememberUn"));
		clickButton(remembercheck,"Remember");
		Thread.sleep(4000);
		
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login");
		
		Thread.sleep(6000);
		
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile");
		
		WebElement logout = driver.findElement(By.xpath("//a[@title=\"Logout\"]"));
		clickButton(logout,"Logout");
		
		Thread.sleep(4000);
		WebElement username1 = driver.findElement(By.id("idcard-identity"));
		String actual = username1.getText();
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}		
		close();

	}

}
