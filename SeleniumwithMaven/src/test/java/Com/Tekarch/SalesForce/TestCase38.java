package Com.Tekarch.SalesForce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase38 extends BasicTest{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expected= " Month View ~ Salesforce - Developer Edition";
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
		
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'Sunday February 12, 2023')]"));
		clickButton(date, "Date Time Link");
		Thread.sleep(4000);
		
		WebElement time = driver.findElement(By.xpath("//div[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a[1]"));
		clickButton(time,"Time");
		String baseHandle = driver.getWindowHandle();
		Thread.sleep(4000);
		WebElement subject = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/a[1]/img[1]"));
		clickButton(subject, "Subject");
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!baseHandle.equals(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		Thread.sleep(4000);
		WebElement others = driver.findElement(By.xpath("//body/div[2]/ul[1]/li[5]/a[1]"));
		clickButton(others, "Others Button");
		driver.switchTo().window(baseHandle);
		Thread.sleep(4000);
		WebElement endTime = driver.findElement(By.xpath("//input[@id=\"EndDateTime_time\"]"));
		clickButton(endTime,"End Time");
		WebElement pickTime = driver.findElement(By.xpath("//div[@id=\"timePickerItem_38\"]"));
		clickButton(pickTime, "Pick Time" );
		Thread.sleep(4000);
		
		WebElement recurrence = driver.findElement(By.xpath("//input[@id=\"IsRecurrence\"]"));
		clickButton(recurrence,"recurrence radiobtn");
		WebElement weekly = driver.findElement(By.xpath("//input[@id=\"rectypeftw\"]"));
		clickButton(weekly, "Weekly");
		Thread.sleep(4000);
		WebElement recursiveEnd = driver.findElement(By.xpath("//input[@id=\"RecurrenceEndDateOnly\"]"));
		clickButton(recursiveEnd, "End date");
		WebElement enddate = driver.findElement(By.xpath("//tr[@id=\"calRow5\"]/td[1]"));
		clickButton(enddate,"End");
		Thread.sleep(4000);
		
		WebElement savebtn = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[@value=\" Save \"]"));
		clickButton(savebtn, "save button");
		Thread.sleep(4000);
	    /* handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!baseHandle.equals(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		try {
		WebElement dismiss = driver.findElement(By.id("dismiss_all"));
		clickButton(dismiss,"Dismiss all");
		}finally {
		driver.switchTo().window(baseHandle);}
		Thread.sleep(4000);*/
	
		WebElement monthview = driver.findElement(By.xpath("//img[@class=\"monthViewIcon\"]"));
		clickButton(monthview, "Month view");
		Thread.sleep(4000);
		validateTitle(expected);
		close();
		

		
	}

}
