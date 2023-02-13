package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase12 {
	//Error in validation

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String expected = "Tekarchnew";
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
		
		WebElement newView = driver.findElement(By.xpath("//a[text()=\"Create New View\"]"));
		newView.click();
		
		WebElement viewName = driver.findElement(By.id("fname"));
		viewName.sendKeys("Tekarchenexnew");
		
		WebElement viewUnique = driver.findElement(By.id("devname"));
		viewUnique.sendKeys("Tekarchdenex_view");
		
		WebElement savebtn = driver.findElement(By.xpath("//div[@class=\"pbHeader\"]//input[1][@class=\"btn primary\"]"));
		savebtn.click();
		
		Thread.sleep(5000);
		
		/*WebElement viewList = driver.findElement(By.xpath("//select[@id=\"00BDn00000KSdc9_listSelect\" and @name=\"fcf\"]"));
		Select ob = new Select(viewList);
		if(ob.getFirstSelectedOption().equals(viewName)) {
			System.out.println("Test case passed");
			
		}else {
			System.out.println("Test case failed");
		}*/
		

		driver.close();
	}
	

}
