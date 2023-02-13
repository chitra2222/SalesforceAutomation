package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase25 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected="ABCD";
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
		
		WebElement newbtn = driver.findElement(By.xpath("//input[@value=\" New \"]"));
		clickButton(newbtn, "New Button");
		
		Thread.sleep(4000);
		WebElement lastName = driver.findElement(By.id("name_lastlea2"));
		enterText(lastName,"ABCD","Last name");
		
		WebElement companyName = driver.findElement(By.id("lea3"));
		enterText(companyName, "ABCD", "Company name");
		Thread.sleep(4000);
		
		WebElement savebtn = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[1]"));
		clickButton(savebtn, "Save Button");
		Thread.sleep(4000);
		validateTitle(expected);
		close();

	}

}
