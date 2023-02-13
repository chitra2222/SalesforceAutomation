package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Tekarch.Utility.PropertiesUtility;

public class TestCase16 extends BasicTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expallopt = "All Opportunities";
		String expclosingnextmonth = "Closing Next Month";
		String expclosingthismonth = "Closing This Month";
		String expmyopt = "My Opportunities";
		String expnewlastweek = "New Last Week";
		String expnewthisweek = "New This Week";
		String expoptpipeline = "Opportunity Pipeline";
		String expprivat = "Private";
		String exprecentview = "Recently Viewed Opportunities";
		String expwon = "Won";

		
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
		
		WebElement oppurtunity = driver.findElement(By.xpath("//li[@id=\"Opportunity_Tab\"]/a[1]"));
		clickButton(oppurtunity,"Oppurtunity tab");
		
		WebElement lightningalert = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		clickButton(lightningalert,"lightningalert close button");

		Thread.sleep(4000);
	
		WebElement optDrop = driver.findElement(By.id("fcf"));
		clickButton(optDrop,"opt Dropdown");

		Thread.sleep(4000);
		
		WebElement allopt = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[1]"));
		WebElement closingnextmonth = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[2]"));
		WebElement closingthismonth = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[3]"));
		WebElement myopt = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[4]"));
		WebElement newlastweek = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[5]"));
		WebElement newthisweek = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[6]"));
		WebElement optpipeline = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[7]"));
		WebElement privat = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[8]"));
		WebElement recentview = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[9]"));
		WebElement won = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[10]"));
		
		if(allopt.getText().equalsIgnoreCase(expallopt) && closingnextmonth.getText().equals(expclosingnextmonth) && closingthismonth.getText().equals(expclosingthismonth) 
				&& myopt.getText().equals(expmyopt) && newlastweek.getText().equals(expnewlastweek) && newthisweek.getText().equals(expnewthisweek)
				&& optpipeline.getText().equals(expoptpipeline) && privat.getText().equals(expprivat) && recentview.getText().equals(exprecentview)
				&& won.getText().equals(expwon)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}



		close();



	}

}
