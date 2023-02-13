package Com.Tekarch.SalesForce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase17 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		String expected = "Salesforce - Developer Edition";
		
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
		
		WebElement createnew = driver.findElement(By.id("createNewButton"));
	    clickButton(createnew,"create new dropdown");		
		WebElement createnewopt = driver.findElement(By.xpath("//div[@id=\"createNewMenu\"]/a[4]"));
	    clickButton(createnewopt,"create new oppurtunity");
		Thread.sleep(4000);
		WebElement optname = driver.findElement(By.id("opp3"));
		enterText(optname, "lekhaoppurtunity" ,"oppurtunity name");
		String baseHandle= driver.getWindowHandle();
		WebElement acctname = driver.findElement(By.id("opp4"));
		acctname.clear();
		WebElement searchacctname = driver.findElement(By.xpath("//a[@id=\"opp4_lkwgt\"]/img[@class=\"lookupIcon\"]"));
		clickButton(searchacctname,"Search Account");
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!baseHandle.equals(handle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(4000);
		//WebElement accname = driver.findElement(By.id("id=\"lksrch\""));
		//enterText(accname,"Dh","Account name");
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@id=\"resultsFrame\"]"));
		driver.switchTo().frame(frame1);
		
		Thread.sleep(4000);		
		WebElement accname = driver.findElement(By.xpath("//tr[@class=\"dataRow even first\"]//a[@class=\" dataCell \"]"));
		clickButton(accname,"Account name");
		
		driver.switchTo().window(baseHandle);
		Thread.sleep(4000);
		
		WebElement closedate = driver.findElement(By.xpath("//span[@class=\"dateFormat\"]/a[1]"));
		clickButton(closedate,"Close Date");
		
		WebElement stage = driver.findElement(By.xpath("//select[@id=\"opp11\"]"));
		selectDropDown(stage,"Qualification");
		
		
		WebElement probability = driver.findElement(By.id("opp12"));
		enterText(probability, "20", "Probability");
		
		Thread.sleep(4000);
		
		//WebElement campaign = driver.findElement(By.xpath("//img[@class=\"lookupIcon\"]"));
		//clickButton(campaign, "Campaign source");
		
		WebElement leadsource = driver.findElement(By.id("opp6"));
		Select ob1 = new Select(leadsource);
		ob1.selectByVisibleText("Phone Inquiry");
		
		WebElement save = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[1]"));
		clickButton(save,"Save Button");
		
		Thread.sleep(4000);
		//System.out.println(driver.getTitle());
		
		validateTitle(expected);
		close();


	}

}
