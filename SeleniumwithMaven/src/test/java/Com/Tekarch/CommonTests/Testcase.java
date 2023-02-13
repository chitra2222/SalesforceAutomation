package Com.Tekarch.CommonTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase extends BaseTest {
	
	
	public static void loginToFirebase() throws InterruptedException {
		String expected = "Student Registration Form";
		
		browser("https://qa-tekarch.firebaseapp.com/");
		
		Thread.sleep(4000);
		By ob1= By.id("email_field");
		WebElement username = driver.findElement(ob1);
		enterText(username, "admin123@gmail.com", "username");
		
		By ob2 = By.id("password_field");
		WebElement password = driver.findElement(ob2);
		enterText(password,"admin123","password");
		
		By ob3 = By.xpath("/html/body/div[1]/button" );
		WebElement log = driver.findElement(ob3);
		clickButton(log);
		
		Thread.sleep(4000);
		
		WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h1"));
		getText1(text, expected, "login");
		
		close();
		
	}
	
	public static void loginToSalesforce() throws InterruptedException {
		String expected = "Please enter your password.";
		browser("https://login.salesforce.com/");
		By ob1 = By.id("username");
		WebElement username = driver.findElement(ob1);
		enterText(username, "username", "username");
		
		By ob2 =By.id("password");
		WebElement pass = driver.findElement(ob2);
		enterText(pass, "", "password");
		
		WebElement log = driver.findElement(By.id("Login"));
		clickButton(log);

		Thread.sleep(4000);
		By ob3=By.id("error");
		WebElement errmessage = driver.findElement(ob3);
		getText1(errmessage,expected,"Errormessage");
		
		close();
	}
	
	public static void errorFirebase() throws InterruptedException {
		String expected = "Error : The email address is badly formatted.";
         browser("https://qa-tekarch.firebaseapp.com/");
		
		Thread.sleep(4000);
		By ob1= By.id("email_field");
		WebElement username = driver.findElement(ob1);
		enterText(username, "admin", "username");
		
		By ob2 = By.id("password_field");
		WebElement password = driver.findElement(ob2);
		enterText(password,"admin123","password");
		
		By ob3 = By.xpath("/html/body/div[1]/button" );
		WebElement log = driver.findElement(ob3);
		clickButton(log);
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		String actual = alert.getText();
		alert.accept();
		if(actual.equals(expected)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		close();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//loginToFirebase();
		//loginToSalesforce();
		errorFirebase();
	}

}
