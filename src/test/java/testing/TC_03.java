package testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_03 {

	WebDriver driver;
	@BeforeClass

	//This line is creating chromedriver;

	public void launch_the_application() {
		System.out.println("I am Launching google chrome browser");
		driver=new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

	}

	@Test
	public void checkbox_testing() {

		driver.get("https://admin:admin@the-internet.herokuapp.com");

		boolean checked=driver.findElement (By.xpath ("//a[text()='Checkboxes']")).isSelected (); 
		if (checked==false) 
			driver.findElement (By.xpath ("//a[text()='Checkboxes']")).click ();
		    System.out.println("Default checkbox2 checked");

	}

	@Test
	public void authentication_testing() {

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		if(driver.findElement(By.xpath("//h3")).isDisplayed())
		{
			System.out.println("Login is Successful");
		}

	}
	@Test
	public void dropdown_testing() {
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement selectElement  = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select select = new Select(selectElement);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());

		}

	}

	@Test
	public void hover_testing(){

		//Performing the mouse hover action on the target element.
		driver.get("https://admin:admin@the-internet.herokuapp.com/hovers");

		WebElement ele = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Hover option3");

	}
	@Test
	public void webalert_testing() {
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		// Now click on Click for JS Alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alert_text = alert.getText();
		System.out.println(alert_text);
		
		// Type in Alert pop up
		
	//	alert.sendKeys("Learning Selenium");
		
		//alert.accept();
	
	}

	@AfterClass
	public void close_application() {
		System.out.println("I am Closing browser");
		driver.quit();
	}

}
