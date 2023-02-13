package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expected = "Forgot Your Password";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		WebElement forgot = driver.findElement(By.id("forgot_password_link"));
		forgot.click();
		
		WebElement forgotpwd = driver.findElement(By.id("header"));
		if(forgotpwd.getText().equalsIgnoreCase(expected))
		{
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		
     driver.close();		
		

	}

}
