package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase22 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expallOpen = "All Open Leads";
		String expunread = "My Unread Leads";
		String exprecentView = "Recently Viewed Leads";
		String exptoday = "Today's Leads";

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
		clickButton(leadsdropdown, "Leads Drop Down");
		WebElement allOpen = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[1]"));
		WebElement unread = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[2]"));
		WebElement recentView = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[3]"));
		WebElement today = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[4]"));
		Thread.sleep(4000);
		
		if(allOpen.getText().equals(expallOpen) && unread.getText().equals(expunread) 
				&& recentView.getText().equals(exprecentView) && today.getText().equals(exptoday)) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case failed");
		}
		close();
	}

}
