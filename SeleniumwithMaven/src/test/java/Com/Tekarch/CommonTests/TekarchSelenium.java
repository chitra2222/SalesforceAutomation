package Com.Tekarch.CommonTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TekarchSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		
		By ob1 = By.id("email_field");
		WebElement username = driver.findElement(ob1);
		username.sendKeys("admin123@gmail.com");
		
		By ob2 = By.id("password_field");
		WebElement password = driver.findElement(ob2);
		password.sendKeys("admin123");

		
		By ob3 = By.xpath("/html/body/div[1]/button");
		WebElement loggin = driver.findElement(ob3);
		loggin.click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		By ob4 = By.id("name");
		WebElement textName = driver.findElement(ob4);
		textName.sendKeys("Chitra");
		
		driver.close();
	
	}

}
