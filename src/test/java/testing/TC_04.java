package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class TC_04 {

	WebDriver driver;

	@BeforeClass
    @Parameters({"url"})
    
	
	public void launch_the_application(String url) {
		System.out.println("I am Launching child support browser");
		driver=new ChromeDriver(); 
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

	}


	@Test
	public void test_Contact_us_2() {
		
		//Navigate to Contact us page
		driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to get online case information. ']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to calculate child support.']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to make a payment.']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Click on button to apply for services.']")).isDisplayed());
		
	}
	

	@Test
	@Parameters({"title","url"})
	public void test_homepage_1(String title, String url) {
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String runtime_title = driver.getTitle();
		Assert.assertEquals(title, runtime_title);
	}
    @Test
    
    public void testing_3() {
    	
    }
	
	@AfterClass
	public void close_application() {
		System.out.println("I am Closing  browser");
		driver.quit();
	}

}

