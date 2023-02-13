package Com.Tekarch.CommonTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowSearchWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.partialLinkText("works"));
		Actions action1 = new Actions(driver);
		/*
		 * action.moveToElement(search).build().perform();
		 * action.contextClick(search).build().perform();
		 */   
	   	
	    driver.close();
		

	}

}
