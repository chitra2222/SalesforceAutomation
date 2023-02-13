package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase8 {

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
		
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		profile.click();
		
		WebElement mySetting = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[2]"));
		mySetting.click();
		
		WebElement personal = driver.findElement(By.id("PersonalInfo_font"));
		personal.click();
		
		WebElement loginHistory = driver.findElement(By.id("LoginHistory_font"));
		loginHistory.click();
		
		WebElement loginDownload = driver.findElement(By.xpath("//div[@id=\"RelatedUserLoginHistoryList_body\"]//a[1]"));
		loginDownload.click();
		
		WebElement display = driver.findElement(By.xpath("//span[@id=\"DisplayAndLayout_font\"]"));
		display.click();
		
		Thread.sleep(4000);
		
		WebElement customizeTabs = driver.findElement(By.xpath("//span[@id=\"CustomizeTabs_font\"]"));
		customizeTabs.click();
		
		WebElement customApp = driver.findElement(By.xpath("//select[@id=\"p4\"]"));
		Select ob = new Select(customApp);
		ob.selectByVisibleText("Salesforce Chatter");
		
		Thread.sleep(4000);
		
		WebElement availableTab = driver.findElement(By.xpath("//select[@id=\"duel_select_0\"]"));
		Select ob1 = new Select(availableTab);
		ob1.selectByVisibleText("Reports");
		
		Thread.sleep(4000);
		
		WebElement addbtn = driver.findElement(By.xpath("//img[@class=\"rightArrowIcon\"]"));
		addbtn.click();
	
		Thread.sleep(4000);
		
		WebElement email = driver.findElement(By.xpath("//span[@id=\"EmailSetup_font\"]"));
		email.click();
		
		WebElement myemail = driver.findElement(By.xpath("//a[@id=\"EmailSettings_font\"]"));
		myemail.click();
		
		Thread.sleep(4000);

		WebElement name = driver.findElement(By.xpath("//input[@id=\"sender_name\"]"));
		name.clear();
		name.sendKeys("Chitra");
		
		WebElement address = driver.findElement(By.xpath("//input[@id=\"sender_email\"]"));
		address.clear();
		address.sendKeys("chitralekhajayaprakash@gmail.com");
		
		WebElement bcc = driver.findElement(By.xpath("//input[@id=\"auto_bcc1\"]"));
		bcc.click();
		
		Thread.sleep(4000);
		
		WebElement save = driver.findElement(By.xpath("//td[@id=\"bottomButtonRow\"]/input[@class=\"btn primary\"]"));
		save.click();
		
		
		Thread.sleep(4000);
		
		WebElement calendar = driver.findElement(By.xpath("//span[@id=\"CalendarAndReminders_font\"]"));
		calendar.click();
		
		WebElement activity = driver.findElement(By.xpath("//span[@id=\"Reminders_font\"]"));
		activity.click();
		
		Thread.sleep(4000);
		
		WebElement testRemain = driver.findElement(By.xpath("//input[@id=\"testbtn\"]"));
		testRemain.click();
		
		Thread.sleep(4000);
		

		driver.close();

	}

}
