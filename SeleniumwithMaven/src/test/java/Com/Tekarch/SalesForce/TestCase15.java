package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase15 {

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

		WebElement reportLink = driver.findElement(By.xpath("//a[text()=\"Accounts with last activity > 30 days\"]"));
		reportLink.click();
		
		Thread.sleep(4000);
		
		WebElement from = driver.findElement(By.xpath("//img[@id = \"ext-gen152\"]"));
		from.click();
		
		Thread.sleep(4000);
		WebElement today=driver.findElement(By.xpath("//td[@title=\"Today\"]"));
		today.click();
		
		Thread.sleep(4000);

		WebElement toDate = driver.findElement(By.xpath("//input[@id=\"ext-comp-1045\"]"));
		toDate.clear();
		
		WebElement to = driver.findElement(By.xpath("//img[@id=\"ext-gen154\"]"));
		to.click();
		
		Thread.sleep(6000);
		
		WebElement today1 = driver.findElement(By.xpath("//button[@id=\"ext-gen292\"]"));
		today1.click();
		
		
		WebElement savebtn = driver.findElement(By.xpath("//button[@id=\"ext-gen49\"]"));
		savebtn.click();
		Thread.sleep(4000);
		
		WebElement reportName = driver.findElement(By.xpath("//input[@id=\"saveReportDlg_reportNameField\"]"));
		reportName.sendKeys("Finalssss");
		
		WebElement reportUnique = driver.findElement(By.xpath("//input[@id=\"saveReportDlg_DeveloperName\"]"));
		reportUnique.sendKeys("Finalreports");
		
		Thread.sleep(5000);
		
		WebElement saverun = driver.findElement(By.xpath("//button[@id=\"ext-gen312\"]"));
		saverun.click();
		
		Thread.sleep(4000);
		WebElement image=driver.findElement(By.xpath("//div[@class=\"content\"]/h1"));
		
		if(image.getText().equalsIgnoreCase("Finalssss")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		driver.close();
		


	}

}
