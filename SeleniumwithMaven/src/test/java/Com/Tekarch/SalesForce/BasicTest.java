package Com.Tekarch.SalesForce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	
	static WebDriver driver = null;

	
	public static void getBrowser(String url) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void enterText(WebElement element, String text, String name) {
		if(element.isDisplayed()) {
			element.clear();
			element.sendKeys(text);
			}else {
				System.out.println(name+" is not displayed");
			}
	}
	
	public static void clickButton(WebElement element, String btnName) {
		if(element.isEnabled()) {
		element.click();
		}else {
			System.out.println(btnName+" is not enabled");
		}
	}
	
	public static void selectDropDown(WebElement element, String text) {
		Select ob = new Select(element);
		ob.selectByVisibleText(text);
	}
	
	public static void validate(WebElement element, String expected, String name) {
		if(element.isDisplayed()) {
			String actual = element.getText();
			if(actual.contains(expected)) {
				System.out.println("Test case passed");
			}else {
				System.out.println("Test case failed");
			}
		}else {
			System.out.println(name+ " element is not displayed");
		}
	}
	
	public static void validateTitle(String expected) {
		if(driver.getTitle().contains(expected))
		{
			System.out.println("TestCase passed");
		}
		else {
			System.out.println("Test case failed");
		}
	}
	
	public static void close() {
		driver.close();
	}
	

}
