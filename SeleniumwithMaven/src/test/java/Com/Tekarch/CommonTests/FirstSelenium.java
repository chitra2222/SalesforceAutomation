package Com.Tekarch.CommonTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		//driver.manage().window().	
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		//driver.navigate().wait();
	    driver.quit();
		//driver.close();

	}

}
