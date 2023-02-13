package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase27 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		getBrowser(url);
		String actualviewname = "Rish";
		String expected = "Contacts ~ Salesforce - Developer Edition";
		
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
		WebElement createnewview = driver.findElement(By.xpath("//form[@id=\"filter_element\"]//a[text()=\"Create New View\"]"));
		clickButton(createnewview,"Create new view");
		
		Thread.sleep(4000);
		WebElement name = driver.findElement(By.id("fname"));
		enterText(name, actualviewname, "View name");
		WebElement uniquename = driver.findElement(By.id("devname"));
		enterText(uniquename,"Rish_view", "Unique View name");
		WebElement save = driver.findElement(By.xpath("//div[@class=\"pbHeader\"]//input[@value=\" Save \"]"));
		clickButton(save, "Save Button");
		Thread.sleep(4000);

		/*WebElement contactdropdown = driver.findElement(By.xpath("//div[@id=\"00BDn00000KTluc_topNav\"]//select[@id=\"00BDn00000KTluc_listSelect\"]"));
		Select ob1 = new Select(contactdropdown);
		String expviewname = ob1.getFirstSelectedOption().getText();
		System.out.println(expviewname);
		if(expviewname.equals(actualviewname))	{
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}*/
		
		validateTitle(expected);
		

		close();

	}

}
