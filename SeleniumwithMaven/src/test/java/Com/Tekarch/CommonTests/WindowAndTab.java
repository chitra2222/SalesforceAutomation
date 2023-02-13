package Com.Tekarch.CommonTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAndTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String newwindowhandle = null;
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
		
		WebElement switchto = driver.findElement(By.xpath("//body/div[2]/div/div[1]/button[1][@class=\"dropbtn\"]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(switchto).build().perform();
		
		WebElement wind =driver.findElement(By.xpath("//body/div[2]/div/div[1]/div[1]/a[2]"));
		//action1.click(wind).build().perform();
		wind.click();
		String tekarchwindowhandle = driver.getWindowHandle();
		Thread.sleep(4000);
		
		
		WebElement newwindow = driver.findElement(By.xpath("//body/div[2]/div[2]/a[2]/button"));
		newwindow.click();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			if(!tekarchwindowhandle.equals(handle)) {
				 newwindowhandle = handle;
				driver.switchTo().window(handle);
				break;
			}
		}
		Thread.sleep(4000);
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		Thread.sleep(4000);
		
		driver.switchTo().window(tekarchwindowhandle);
		
		WebElement newtab = driver.findElement(By.xpath("//body/div[2]/div[2]/a[1]/button"));
		newtab.click();
		
		Set<String> handles1=driver.getWindowHandles();
		for(String handle:handles1) {
			if(!tekarchwindowhandle.equals(handle) && !newwindowhandle.equals(handle)) {
				driver.switchTo().window(handle);
				break;
				
			}
		}
         Thread.sleep(4000);
		
		WebElement search1 = driver.findElement(By.name("q"));
		search1.sendKeys("selenium");
		Thread.sleep(4000);
		
		driver.switchTo().window(tekarchwindowhandle);
		Thread.sleep(4000);
		
		WebElement logout= driver.findElement(By.xpath("//body/div[2]/div[1]/a[4]"));
		logout.click();
		Thread.sleep(4000);
		
		driver.quit();

		
		

	}

}
