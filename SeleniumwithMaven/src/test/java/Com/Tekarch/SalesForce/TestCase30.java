package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase30 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		////tr[@class="dataRow even first"]/th[@scope="row"]/a
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		getBrowser(url);
		String expected = "Contact: Prakash ~ Salesforce - Developer Edition";
		
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
		WebElement contactname = driver.findElement(By.xpath("//a[contains(text(),'Prakash')]"));
		clickButton(contactname, "Cantact name");
		Thread.sleep(4000);
		validateTitle(expected);
		close();

	}

}
