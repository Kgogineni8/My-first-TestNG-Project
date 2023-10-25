package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Iframe_learning {
	
	WebDriver driver;
	@BeforeClass
	public void lanuch_application() {
		
		System.out.println("I am Launching  browser");
		driver=new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

	}
	
	@Test
	//@Parameters({"test","url"})
	
	public void Iframe_validation() {
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		System.out.println("test");
		driver.switchTo().frame(0);
		
		//clearing the text
		driver.findElement(By.xpath("//p[text()='Your content goes here.']")).clear();
		
		//Enter text
		driver.findElement(By.xpath("//p")).sendKeys("hello");
		
		
		System.out.println(driver.getTitle());
		
		//switching back to page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//h3")).isDisplayed();
		driver.navigate().back();
		driver.navigate().forward();
		
	}
	@AfterClass
	public void close_application() {
		System.out.println("I am Closing  browser");
		driver.quit();
	}
}
