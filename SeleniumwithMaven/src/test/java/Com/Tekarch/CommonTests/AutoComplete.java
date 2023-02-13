package Com.Tekarch.CommonTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String expected = "United States of America";
		String expected = "India";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		
		WebElement username = driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password_field"));
		pwd.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//body/div[1]/button"));
		login.click();
		
		Thread.sleep(4000);
		WebElement widjet = driver.findElement(By.xpath("//body/div[2]/div[1]/div[3][@class=\"dropdown\"]")); 
		Actions action1 = new Actions(driver);
		action1.moveToElement(widjet).build().perform();
		
		WebElement auto = driver.findElement(By.xpath("//body/div[2]/div[1]/div[3]/div[1]/a[3]"));
		Actions action2 = new Actions(driver);
		action2.click(auto).build().perform();
		
		Thread.sleep(4000);
		
		WebElement country = driver.findElement(By.xpath("//body/div[2]/div[2]/form/div/input[@name=\"myCountry\"]"));
		country.sendKeys("i");
		Thread.sleep(4000);
		
		List<WebElement> places = driver.findElements(By.xpath("//form/div/div/div"));
		for(WebElement ele:places) {
			//System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase(expected)) {
				//country.sendKeys(expected);
			     ele.click();
			     break;
				
			}
		}
		//Thread.sleep(4000);
		driver.close();

	}

}
