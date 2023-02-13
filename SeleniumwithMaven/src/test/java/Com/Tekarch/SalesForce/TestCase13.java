package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//unable to find the webelement

public class TestCase13 {

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
		
		Thread.sleep(8000);
		WebElement viewList = driver.findElement(By.xpath("//select[@id=\"fcf\" and @name=\"fcf\"]"));		

		//WebElement viewList = driver.findElement(By.xpath("//select[@id=\"00BDn00000KSdcO_listSelect\" and @name=\"fcf\"]"));
		Select ob = new Select(viewList);
		ob.selectByVisibleText("Tekarchnews");
		
		Thread.sleep(4000);
		
		WebElement edit = driver.findElement(By.xpath("//form[@id=\"filter_element\"]//a[text()=\"Edit\"]"));
		edit.click();
		
		Thread.sleep(4000);
		
		WebElement editname = driver.findElement(By.xpath("//input[@id=\"fname\"]"));
		editname.sendKeys("Tekarchedit");
		
		WebElement field = driver.findElement(By.xpath("//select[@id=\"fcol1\"]"));
		Select ob1 = new Select(field);
		ob1.selectByVisibleText("Account Name");
		
		Thread.sleep(4000);
		WebElement operator = driver.findElement(By.xpath("//select[@id=\"fop1\"]"));
		Select ob2 = new Select(operator);
		ob2.selectByVisibleText("contains");
		
		WebElement value = driver.findElement(By.xpath("//input[@name=\"fval1\"]"));
		value.clear();
		value.sendKeys("a");
		
		WebElement save = driver.findElement(By.xpath("//input[@class=\"btn primary\" and @data-uidsfdc=\"5\"]"));
		save.click();
		
		
		
		Thread.sleep(4000);
		
		driver.close();

	}

}
