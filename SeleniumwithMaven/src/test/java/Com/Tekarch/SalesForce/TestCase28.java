package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase28 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		getBrowser(url);
		String expected = "Recent Contacts";
		
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
		WebElement recentdropdown = driver.findElement(By.id("hotlist_mode")) ;
		selectDropDown(recentdropdown,"Recently Created");
		
		Thread.sleep(4000);
		WebElement contactPage = driver.findElement(By.xpath("//h3[text()=\"Recent Contacts\"]"));
		validate(contactPage, expected, "Recent list");
		
		close();

	}

}
