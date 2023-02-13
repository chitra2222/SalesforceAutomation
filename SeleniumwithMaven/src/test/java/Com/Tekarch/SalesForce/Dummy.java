package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expTitle = "User: Chitralekha prakash ~ Salesforce - Developer Edition";
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
		
		Thread.sleep(4000);
		
		WebElement myProfile = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[1]"));
		myProfile.click();
		

		Thread.sleep(4000);
		
		WebElement moderator = driver.findElement(By.xpath("//span[@id=\"displayBadge\"]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(moderator).build().perform();
		
		
		WebElement addPhoto = driver.findElement(By.xpath("//div[@class=\"photoUploadSection\"]/a[@id=\"uploadLink\"]"));
		addPhoto.click();
		
		Thread.sleep(4000);
		
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id=\"uploadPhotoContentId\"]"));
		driver.switchTo().frame(frame3);
		
		WebElement choosePhoto = driver.findElement(By.xpath("//input[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
		choosePhoto.sendKeys("C:\\Users\\chitr\\OneDrive\\Desktop\\20210329_095508.jpg");
		
		Thread.sleep(4000);
		
		WebElement savePhoto = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
		savePhoto.click();
		
         Thread.sleep(4000);  
         
         WebElement save = driver.findElement(By.id("j_id0:j_id7:save"));
       	 save.click();
       	 
       	 Thread.sleep(4000);
         
         driver.switchTo().defaultContent();
		
		
		driver.close();

	}

}
