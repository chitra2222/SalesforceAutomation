package Com.Tekarch.CommonTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	static WebDriver driver = null;
	public static void enterText(WebElement element, String text, String name) {
		if(element.isDisplayed()) {
			element.clear();
			element.sendKeys(text);
			}else {
				System.out.println(name+" is not displayed");
			}
	}
	
	public static void clickButton(WebElement element) {
		element.click();
	}
	
	public static void getText1(WebElement element, String expected, String name) {
		if(element.isDisplayed()) {
			String actual = element.getText();
			if(actual.equalsIgnoreCase(expected)) {
				System.out.println("Test case passed");
			}else {
				System.out.println("Test case failed");
			}
		}else {
			System.out.println(name+ " element is not displayed");
		}
	}
	
	public static void browser(String path) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(path);
	}
	
	public static void close() {
		driver.close();
	}

}
