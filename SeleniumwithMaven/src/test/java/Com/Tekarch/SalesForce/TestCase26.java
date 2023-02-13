package Com.Tekarch.SalesForce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase26 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected="Salesforce - Developer Edition";
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		getBrowser(url);
		
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, uname,"User i.d");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwd ,"Password");
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login");
		Thread.sleep(4000);
		
		WebElement contacts = driver.findElement(By.xpath("//li[@id=\"Contact_Tab\"]/a[1]"));
		clickButton(contacts,"Contacts tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		
		Thread.sleep(4000);
		WebElement newbtn = driver.findElement(By.xpath("//input[@value=\" New \" and @class=\"btn\"]"));
		clickButton(newbtn, "New Button");
		
		Thread.sleep(4000);
		WebElement lastname = driver.findElement(By.id("name_lastcon2"));
		enterText(lastname,"Prakash", "Last name field");
		String basehandle = driver.getWindowHandle();
		WebElement lookup = driver.findElement(By.xpath("//a[@id=\"con4_lkwgt\"]/img[@class=\"lookupIcon\"]"));
		clickButton(lookup, "Accountname button");
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!basehandle.equals(handle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(4000);
		WebElement frame1 = driver.findElement(By.xpath("//frame[@id=\"resultsFrame\"]"));
		driver.switchTo().frame(frame1);

		WebElement acctname = driver.findElement(By.xpath("//tr[@class=\"dataRow even first\"]//a[1]"));
		clickButton(acctname, "Account name");
		Thread.sleep(4000);
		driver.switchTo().window(basehandle);
		
		WebElement savebtn = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[1]"));
		clickButton(savebtn,"Save button");
		
		validateTitle(expected);
		close();

	}

}
