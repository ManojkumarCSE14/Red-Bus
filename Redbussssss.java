package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Redbussssss {

	WebDriver driver;
	JavascriptExecutor js;
	Actions acc;
	@BeforeSuite
	
	public void launchBrowser() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\NEOTECH\\eclipse-workspace\\Selenium1\\Drive\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
		
	}
	@Test (priority=1)
	
	public void launchUrl() {
	
		 
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
	}
@Test (priority=2)
	
	public void loginAcc() throws InterruptedException {
		
		//AccButton
		
	  WebElement login = driver.findElement(By.xpath("(//span[@class='name_rb_secondary_item'])[2]"));
	  login.click();
	  
	  
	  
	  //Singup
	  WebElement singup = driver.findElement(By.xpath("//span[contains(text(),'Login/ Sign Up')]"));
	  singup.click();
	  
	  Thread.sleep(4000);
	
	  }
	
@Test (priority=3)
	
	public void switchtoFrame() throws InterruptedException {
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(frame);
	Thread.sleep(2000);
}

@Test (priority=4)

public void enterMobno() throws InterruptedException, IOException {
	//Mobno
	   
	  WebElement mobNo = driver.findElement(By.id("mobileNoInp"));
	  mobNo.sendKeys("9788094717",Keys.ENTER);
		
		
//		WebElement mobClick = driver.findElement(By.id("mobileNoInp"));
//		mobClick.click();
//		
//		mobClick.sendKeys(Keys.ENTER);
		
		Thread.sleep(25000);
		
		
		
		  
		
		//otp
		
		 WebElement otp = driver.findElement(By.id("otp-container"));
		  otp.click();
		  
		  
		//ScreenShot1
			
		  File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src1, new File("C:\\Users\\NEOTECH\\eclipse-workspace\\Selenium1\\ScreenShot\\login.png"));
		  
		
		  Thread.sleep(25000);
		  
		
			
		  WebElement otpEnter = driver.findElement(By.id("verifyUser"));
		  otpEnter.click();
		  
		
			
		  
		  Thread.sleep(5000);
		 
			
}

@Test (priority=5)

public void fromTolocaton() {
		  
		//from
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		
		//to
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore");
		
}
@Test (priority=6)

public void dateSelect() throws IOException {
		//date
	
	    js= (JavascriptExecutor)driver;
		WebElement datein = driver.findElement(By.xpath("//span[@class='dateText']"));
		js.executeScript("arguments[0].click()",datein);
		
		WebElement datesl = driver.findElement(By.xpath("(//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH'])[3]"));
		js.executeScript("arguments[0].click()",datesl);
		
		 //ScreenShot2
		
		  File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src2, new File("C:\\Users\\NEOTECH\\eclipse-workspace\\Selenium1\\ScreenShot\\date.png"));
		
		
		
}

@Test (priority=7)

public void searchButton() throws InterruptedException {
		
		//search
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//button[@id='search_button']"));

		 acc=new Actions(driver);
		acc.moveToElement(search).perform();
		acc.doubleClick(search).perform();
		
}

@Test (priority=8)

public void busList() throws InterruptedException, IOException {
		
		//buslist
		
		Thread.sleep(15000);
		
		WebElement scrollDown = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]"));
		 js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
			
		Thread.sleep(2000);
		
		//busclick 
		
		 driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[1]")).click();
		 
	
		  
		Thread.sleep(15000);
		
		
		 //ScreenShot3
		
		  File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src3, new File("C:\\Users\\NEOTECH\\eclipse-workspace\\Selenium1\\ScreenShot\\busclick.png"));
		
}

@Test (priority=9)

public void pickupDropLocation() throws InterruptedException, IOException {
		
	
		 WebElement select = driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[1]"));
			js.executeScript("arguments[0].click()",select);
			
			WebElement select2 = driver.findElement(By.xpath("(//div[@class='radio-unchecked'])[16]"));
			js.executeScript("arguments[0].click()",select2);
			
			//ScreenShot4
			
			  File src4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(src4, new File("C:\\Users\\NEOTECH\\eclipse-workspace\\Selenium1\\ScreenShot\\fromto.png"));
			
			WebElement scrollDown2 = driver.findElement(By.xpath("(//div[@class='label'])[2]"));
			 js.executeScript("arguments[0].scrollIntoView(true)", scrollDown2);
			
			Thread.sleep(5000);
			
			 
			
			driver.findElement(By.xpath("//button[@class='button continue inactive']")).click();
			
			Thread.sleep(5000);
}

@Test (priority=10)

public void enterDetails() throws InterruptedException, IOException {
			
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
     	js.executeScript("arguments[0].setAttribute('value','Manoj')",name);
     	
     	driver.findElement(By.xpath("//div[@id='div_22_0']")).click();
    
     	WebElement age = driver.findElement(By.xpath("//input[@type='number']"));
     	js.executeScript("arguments[0].setAttribute('value','25')",age);
     	
    	 driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
     	
    	 driver.findElement(By.xpath("//li[text()='Tamil Nadu']")).click();
     	
    	
		WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
     	js.executeScript("arguments[0].setAttribute('value','manojvelucse@gmail.com')",mail);
		

     	WebElement phno = driver.findElement(By.xpath("//input[@id='seatno-06']"));
     	js.executeScript("arguments[0].setAttribute('value','9788094717')",phno);
     	
     	
     	//ScreenShot5
		
		  File src5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src5, new File("C:\\Users\\NEOTECH\\eclipse-workspace\\Selenium1\\ScreenShot\\details.png"));
     	
     	driver.findElement(By.xpath("//span[@class='subscribe-txt']")).click();
     	
     	driver.findElement(By.xpath("(//span[@class='checkmark-radio'])[1]")).click();
     	
     	driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
     	
     	driver.findElement(By.xpath("//span[@class='checkmark-radio']")).click();
     	
     	
     	
			
	Thread.sleep(2000);
     	
     
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    
    
  //ScreenShot6
    
    Thread.sleep(5000);
	
	  File src6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src6, new File("C:\\Users\\NEOTECH\\eclipse-workspace\\Selenium1\\ScreenShot\\final.png"));
		
	  
}
	  
		 
		 
		 

}
