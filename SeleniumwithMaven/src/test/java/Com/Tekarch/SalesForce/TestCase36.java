package Com.Tekarch.SalesForce;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase36 extends BasicTest {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		WebElement allTabs = driver.findElement(By.xpath("//li[@id=\"AllTab_Tab\"]/a[1]/img[@class=\"allTabsArrow\"]"));
		clickButton(allTabs, "All Tabs");
		Thread.sleep(4000);
		WebElement customize = driver.findElement(By.xpath("//input[@value=\"Customize My Tabs\"]"));
		clickButton(customize, "Customize tabs");
		Thread.sleep(4000);
		WebElement  tab = driver.findElement(By.xpath("//select[@id=\"duel_select_1\"]/option[text()=\"Libraries\"]"));
		clickButton(tab,"Libraries");
		WebElement remove = driver.findElement(By.xpath("//a[@id=\"duel_select_0_left\"]/img[@title=\"Remove\"]"));
		clickButton(remove, "Remove button");
		WebElement save = driver.findElement(By.xpath("//td[@id=\"bottomButtonRow\"]/input[@value=\" Save \"]"));
		clickButton(save, "Save Button");
		Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//li[@id=\"Workspace_Tab\"]/a[@title=\"Libraries Tab\"]"));
		}catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Test case passed");
		}
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
		try {
			driver.findElement(By.xpath("//li[@id=\"Workspace_Tab\"]/a[@title=\"Libraries Tab\"]"));
		}catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Test case passed");
		}
		
		close();

	}

}
