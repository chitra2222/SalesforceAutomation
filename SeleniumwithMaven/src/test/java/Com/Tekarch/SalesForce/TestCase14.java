package Com.Tekarch.SalesForce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase14 {
	
	//Pending validation

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		Thread.sleep(5000);
		
		WebElement accounts = driver.findElement(By.xpath("//a[@title=\"Accounts Tab\"]"));
		accounts.click();
		
		Thread.sleep(4000);
		
		WebElement closeLight = driver.findElement(By.id("tryLexDialogX"));
		closeLight.click();
		
		Thread.sleep(4000);
		
		WebElement mergeLink = driver.findElement(By.xpath("//div[@class=\"lbBody\"]//a[1][text()=\"Merge Accounts\"]"));
		mergeLink.click();
		
		Thread.sleep(4000);
		
		WebElement accText = driver.findElement(By.id("srch"));
		accText.sendKeys("Dh");
		
		WebElement findaccts = driver.findElement(By.xpath("//input[@name=\"srchbutton\" and @value=\"Find Accounts\"]"));
		findaccts.click();
		
		Thread.sleep(4000);
		
		WebElement clickbtn = driver.findElement(By.xpath("//input[@id=\"cid0\"]"));
		clickbtn.click();
		
		WebElement clickbtn1 = driver.findElement(By.xpath("//input[@id=\"cid1\"]"));
		clickbtn1.click();
		
		Thread.sleep(4000);
		
		WebElement next = driver.findElement(By.xpath("//div[@class=\"pbWizardHeader\"]//input[@value=\" Next \"]"));
		next.click();
		
		Thread.sleep(4000);
		
		WebElement merge = driver.findElement(By.xpath("//div[@class=\"pbWizardHeader\"]//input[@value=\" Merge \" and @title=\"Merge\"]"));
		merge.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
