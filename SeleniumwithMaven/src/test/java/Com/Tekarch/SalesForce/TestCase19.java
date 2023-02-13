package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase19 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected = "Stuck Opportunities ~ Salesforce - Developer Edition";
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
		
		Thread.sleep(5000);
		
		WebElement oppurtunity = driver.findElement(By.xpath("//li[@id=\"Opportunity_Tab\"]/a[1]"));
		clickButton(oppurtunity,"Oppurtunity tab");
		
		WebElement lightningalert = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		clickButton(lightningalert,"lightningalert close button");

		Thread.sleep(4000);

		WebElement stuckopurtunity = driver.findElement(By.xpath("//div[@class=\"lbBody\"]//a[text()=\"Stuck Opportunities\"]"));
		clickButton(stuckopurtunity,"Stuck oppurtunities link");
		
		Thread.sleep(4000);
		
		validateTitle(expected);
		close();


	}

}
