package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("123");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("22131");
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		Thread.sleep(4000);
		WebElement errormsg = driver.findElement(By.id("error"));
		if(errormsg.getText().equalsIgnoreCase(expected)) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		
		Thread.sleep(4000);
		driver.close();

	}

}
