package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expProfile = "My Profile";
		String expSwitch ="Switch to Lightning Experience";
		String expLogout ="Logout";
		String expDevConsole="Developer Console";
		String expSettings ="My Settings";
			
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
		WebElement mySettings = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[2]"));
		WebElement devConsole = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[3]"));
		WebElement switchLight = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[4]"));
		WebElement logout = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[5]"));
		
		
		if(myProfile.getText().equalsIgnoreCase(expProfile) && mySettings.getText().equalsIgnoreCase(expSettings)
		  && devConsole.getText().equalsIgnoreCase(expDevConsole) && switchLight.getText().equalsIgnoreCase(expSwitch)
		  && logout.getText().equalsIgnoreCase(expLogout)) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		
		driver.close();


	}

}
