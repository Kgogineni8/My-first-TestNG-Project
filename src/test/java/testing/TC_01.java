package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_01 {

	WebDriver driver;
	@BeforeClass

	//This line is creating chromedriver;

	public void launch_the_application() {
		System.out.println("I am Launching google chrome browser");
		driver=new ChromeDriver(); 
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

	}


	@Test
	public void do_testing() {
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed());
		

	}

	@Test
	public void do_testing1() {
		System.out.println("My Second TestNG test script");

	}
	@AfterClass
	public void close_application() {
		System.out.println("I am Closing google chrome browser");
		driver.quit();
	}

}
