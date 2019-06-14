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

public class ChromeTest {

	private WebDriver driver;
	
	@BeforeClass
	public static void setupClass(){
		WebDriverManager.chromedriver().setup();
		
	}
	
	@BeforeClass
	public void setupTest(){
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void teardown(){
		if(driver != null){
			driver.quit();
		}
	}
	
	@Test
	public void test(){
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Step by Step");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).sendKeys(Keys.RETURN);;
		driver.findElement(By.xpath("//div[@class='bkWMgd']//div[2]//div[1]//div[1]//div[1]//a[1]//h3[1]"));
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.quit();
		
	}
	
	
	
}
