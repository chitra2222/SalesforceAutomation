package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase11 {

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
		
		Thread.sleep(4000);
		
		WebElement accounts = driver.findElement(By.xpath("//a[@title=\"Accounts Tab\"]"));
		accounts.click();
		
		Thread.sleep(4000);
		
		WebElement closeLight = driver.findElement(By.id("tryLexDialogX"));
		closeLight.click();
		
		
		WebElement newAccount = driver.findElement(By.xpath("//input[@value=\" New \"]"));
		newAccount.click();
		Thread.sleep(4000);
		
		WebElement accname = driver.findElement(By.id("acc2"));
		accname.sendKeys("Dhanalakshmi");
		
		WebElement accType = driver.findElement(By.id("acc6"));
		Select ob = new Select(accType);
		ob.selectByVisibleText("Technology Partner");
		
		WebElement accPriority = driver.findElement(By.id("00NDn00000Sja1A"));
		Select ob1 = new Select(accPriority);
		ob1.selectByVisibleText("High");
		
		
		Thread.sleep(4000);
		
		WebElement savebtn = driver.findElement(By.xpath("//td[@id=\"bottomButtonRow\"]/input[@value=\" Save \"]"));
		savebtn.click();
		Thread.sleep(4000);
		
		/*WebElement savedacct = driver.findElement(By.xpath("//h2[@class=\"topName\"]"));
		if(savebtn.getText().equalsIgnoreCase("Dhanam")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}*/
		
		if(driver.getTitle().contains("Salesforce - Developer Edition")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}

		driver.close();
		


	}

}
