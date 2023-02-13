package Com.Tekarch.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expTitle = "User: Chitralekha prakash ~ Salesforce - Developer Edition";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("chitra@tekarch.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("risharinav1215");
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		Thread.sleep(4000);
		
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		profile.click();
		
		Thread.sleep(4000);
		
		WebElement myProfile = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[1]"));
		myProfile.click();
		

		Thread.sleep(4000);
		
		WebElement editProfile = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]"));
		editProfile.click();
		
		Thread.sleep(4000);
		
		WebElement frame1 = driver.findElement(By.id("contactInfoContentId"));
		driver.switchTo().frame(frame1);
		
		WebElement about = driver.findElement(By.xpath("//li[@id=\"aboutTab\"]/a[1]"));
		about.click();
		
		WebElement last = driver.findElement(By.id("lastName"));
		last.clear();
		last.sendKeys("prakash");
		
		Thread.sleep(4000);
		
		WebElement save = driver.findElement(By.xpath("//div[@class=\"net-buttons zen-mtl\"]/input[1]"));
		save.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);

		WebElement post = driver.findElement(By.xpath("//span[@class=\"publisherattachtext \" and text()=\"Post\"]"));
		post.click();
		
		Thread.sleep(4000);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[contains(@title,\"Rich Text Editor, publisherRichTextEditor\")]"));
		driver.switchTo().frame(frame2);
		
		
		Thread.sleep(4000);
		
		
		WebElement postText = driver.findElement(By.xpath("/html[1]/body[text()=\"Share an update, @mention someone...\"]"));
		postText.click();
		postText.sendKeys("My 1st automation....");   

		driver.switchTo().defaultContent();

		
		Thread.sleep(4000);
		
		WebElement postLink =driver.findElement(By.xpath("//input[@id=\"publishersharebutton\"]"));
		postLink.click();
		
		Thread.sleep(4000);
		
		
		System.out.println("Message is posted");
		

		
		WebElement file = driver.findElement(By.xpath("//a[@id=\"publisherAttachContentPost\"]/span[1]"));
		file.click();
		
		Thread.sleep(4000);
		
		WebElement choose = driver.findElement(By.id("chatterUploadFileAction"));
		choose.click();
		
		Thread.sleep(4000);
		
		WebElement chooseFile = driver.findElement(By.id("chatterFile"));
		chooseFile.sendKeys("C:\\Users\\chitr\\OneDrive\\Desktop\\Upload (2).txt");
		
		Thread.sleep(4000);
		
		WebElement saveFile = driver.findElement(By.id("publishersharebutton"));
		saveFile.click();
		
		
		
		Thread.sleep(4000);
		
		WebElement moderator = driver.findElement(By.xpath("//span[@id=\"displayBadge\"]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(moderator).build().perform();
		
		
		WebElement addPhoto = driver.findElement(By.xpath("//div[@class=\"photoUploadSection\"]/a[@id=\"uploadLink\"]"));
		addPhoto.click();
		
		Thread.sleep(4000);
		
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id=\"uploadPhotoContentId\"]"));
		driver.switchTo().frame(frame3);
		
		WebElement choosePhoto = driver.findElement(By.xpath("//input[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
		choosePhoto.sendKeys("C:\\Users\\chitr\\OneDrive\\Desktop\\20210329_095508.jpg");
		
		Thread.sleep(4000);
		
		WebElement savePhoto = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
		savePhoto.click();
		
         Thread.sleep(4000);  
         
         WebElement savePic = driver.findElement(By.id("j_id0:j_id7:save"));
       	 savePic.click();
       	 
       	 Thread.sleep(4000);
         
         driver.switchTo().defaultContent();
		
		driver.close();

	}

}
