package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected = "Login | Salesforce";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("chitra@tekarch.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("risharinav1215");
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		Thread.sleep(4000);
		
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		profile.click();
		
		WebElement logout = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[5]"));
		logout.click();
		
		Thread.sleep(4000);
		
		if(driver.getTitle().equalsIgnoreCase(expected)) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test case is failed");
		}
		
		driver.close();

	}
	



}
