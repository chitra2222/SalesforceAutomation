package Com.Tekarch.CommonTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TekArchSeli {
	
	public static void logTekarch() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();

		
		By ob1 = By.id("email_field");
		WebElement username = driver.findElement(ob1);
		username.sendKeys("admin123@gmail.com");
		
		By ob2 = By.id("password_field");
		WebElement password = driver.findElement(ob2);
		password.sendKeys("admin123");
		
		By ob3 = By.xpath("/html/body/div[1]/button");
		WebElement logclick = driver.findElement(ob3);
		logclick.click();
		
		Thread.sleep(4000);
		
		By ob4 = By.xpath("/html/body/div[2]/div[2]/form/div[1]/div[2]/input");
		WebElement nameText = driver.findElement(ob4);
		nameText.sendKeys("Chitra");
		
		By ob5 = By.id("lname");
		WebElement fatherText = driver.findElement(ob5);
		fatherText.sendKeys("JayaPrakash");
		
		By ob6 = By.id("postaladdress");
		WebElement postal = driver.findElement(ob6);
		postal.sendKeys("1111 Justin Dr");
		
		By ob7 = By.id("personaladdress");
		WebElement personal = driver.findElement(ob7);
		personal.sendKeys("222 Miller Dr");
		
		Thread.sleep(4000);
		
		
		By ob8 = By.xpath("/html/body/div[2]/div[2]/div/span/button");
		WebElement sub = driver.findElement(ob8);
		sub.click();
		
		WebElement femaleradio = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/span[2]/input"));
		femaleradio.click();
		
		WebElement city = driver.findElement(By.id("city"));
		Select ob = new Select(city);
		ob.selectByVisibleText("PATNA");
		System.out.println(city.getText());
		
		Thread.sleep(2000);	
		driver.close();
			
	}
	
	public static void widject() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		
		WebElement username = driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
		
		WebElement log = driver.findElement(By.xpath("/html/body/div[1]/button"));
		log.click();
		
		Thread.sleep(4000);
		
		WebElement widject = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/button"));
		
		Actions action =new Actions(driver);
		action.moveToElement(widject).build().perform();
		//action.contextClick(widject).build().perform();
		WebElement table = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/a[1]"));
		table.click();
		
		Thread.sleep(4000);
		driver.close();
		
	}
	public static void interactions() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id=\"email_field\"]"));
		username.sendKeys("admin123@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password_field\"]"));
		password.sendKeys("admin123");
		
		WebElement log = driver.findElement(By.xpath("//button[text()=\"Login to Account\"]"));
		log.click();
		
		Thread.sleep(4000);
		
		WebElement interact = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/button[@class=\"dropbtn\"]"));
		interact.click();
		
		/*WebElement drag = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div/a[text()=\"Drag & Drop\"]"));
		drag.click();*/
		
		WebElement hover = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div/a[2][text()=\"Mouse Hover\"]"));
		hover.click();
		
		Thread.sleep(4000);
		
		WebElement mousehover = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/button[@class=\"dropbtn\"]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(mousehover).build().perform();
		Thread.sleep(4000);
		
		WebElement alert = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div/a[text()=\"Alert\"]"));
		alert.click();
		
		Thread.sleep(4000);

		driver.close();

		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//logTekarch();
		//widject();
		interactions();

		
	}

}
