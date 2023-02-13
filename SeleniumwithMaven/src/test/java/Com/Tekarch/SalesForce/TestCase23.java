package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase23 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected = "Leads ~ Salesforce - Developer Edition";
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
		
		WebElement leads = driver.findElement(By.xpath("//li[@id=\"Lead_Tab\"]/a[1]"));
		clickButton(leads, "Leads tab ");
		WebElement lightningalert = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightningalert, "Lightning alert close");
		Thread.sleep(4000);
		
		WebElement leadsdropdown = driver.findElement(By.id("fcf"));
		selectDropDown(leadsdropdown, "My Unread Leads");
		WebElement go = driver.findElement(By.xpath("//input[@class=\"btn\" and  @value=\" Go! \"]"));
		go.click();
		
		Thread.sleep(4000);
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile");
		WebElement logout = driver.findElement(By.xpath("//a[@title=\"Logout\"]"));
		clickButton(logout,"Logout");
		Thread.sleep(4000);
		
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1, uname,"User i.d");
		WebElement password1 = driver.findElement(By.id("password"));
		enterText(password1, pwd ,"Password");
		WebElement login1 = driver.findElement(By.id("Login"));
		clickButton(login1,"Login");
		
		Thread.sleep(4000);
		WebElement leads1 = driver.findElement(By.xpath("//li[@id=\"Lead_Tab\"]/a[1]"));
		clickButton(leads1, "Leads tab ");
		//WebElement lightningalert1 = driver.findElement(By.id("tryLexDialogX"));
		//clickButton(lightningalert1, "Lightning alert close");;
		Thread.sleep(4000);
		WebElement go1 = driver.findElement(By.xpath("//input[@class=\"btn\" and  @value=\" Go! \"]"));
		go1.click();
		Thread.sleep(4000);
		validateTitle(expected);


		close();
		


	}

}
