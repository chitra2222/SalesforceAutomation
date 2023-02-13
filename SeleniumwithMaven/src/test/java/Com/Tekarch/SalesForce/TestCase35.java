package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase35 extends BasicTest {

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
		
		WebElement homeTab = driver.findElement(By.xpath("//li[@id=\"home_Tab\"]/a"));
		clickButton(homeTab,"Home Tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		Thread.sleep(4000);
		
		WebElement userlink = driver.findElement(By.xpath("//h1[@class=\"currentStatusUserName\"]/a[1]"));
		clickButton(userlink, "First and last name link");
		Thread.sleep(4000);
		
		WebElement editProfile = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]"));
		clickButton(editProfile, "Edit Profile Button");		
		Thread.sleep(4000);
		
		WebElement frame1 = driver.findElement(By.id("contactInfoContentId"));
		driver.switchTo().frame(frame1);
		
		WebElement about = driver.findElement(By.xpath("//li[@id=\"aboutTab\"]/a[1]"));
		clickButton(about,"about tab");		
		WebElement last = driver.findElement(By.id("lastName"));
		enterText(last,"prakashhh", "Last name");
		Thread.sleep(4000);
		WebElement saveall = driver.findElement(By.xpath("//div[@class=\"net-buttons zen-mtl\"]/input[1]"));
		clickButton(saveall,"Save all");		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		WebElement namelink = driver.findElement(By.id("tailBreadcrumbNode"));
		validate(namelink,"prakashhh", "Profile name");
		Thread.sleep(4000);
		WebElement userprofile = driver.findElement(By.id("userNavLabel"));
		validate(userprofile,"prakashhh", "Profile name");

		close();

	}

}
