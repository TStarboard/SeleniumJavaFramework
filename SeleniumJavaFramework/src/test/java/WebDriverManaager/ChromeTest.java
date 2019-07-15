package WebDriverManaager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ChromeTest {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setupClass(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		/*System.setProperty("webdriver.chrome.driver", "C:/Users/tswon/git/SeleniumJavaFramework/SeleniumJavaFramework/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
	}
	
	/*@BeforeClass
	public void setupTest(){
		driver = new ChromeDriver();
	}*/
	
	@AfterClass
	public void teardown(){
		if(driver != null){
			driver.quit();
		}
	}
	
	@Test
	public void test() throws InterruptedException{
		
		//driver.manage().window().maximize();
		driver.get("https://www.kink.com");
		driver.findElement(By.xpath("//button[@class='cta-button everything']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@id='kBarLogin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='usernameLoginPopup']")).sendKeys("kink1@fake.com");
		driver.findElement(By.xpath("//input[@id='passwordLoginPopup']")).sendKeys("fake");
		driver.findElement(By.xpath("//button[@id='loginFromPopup']")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		String actual_error = driver.findElement(By.xpath("//span[@class='icon-attention']")).getText();
		Thread.sleep(5000);
		String expected_error = "Bad username or password";
		System.out.println(actual_error);
		Assert.assertEquals(actual_error, expected_error);
		String title2 = driver.getTitle();
		System.out.println(title2);
				
		
	}
	
	
	
}
