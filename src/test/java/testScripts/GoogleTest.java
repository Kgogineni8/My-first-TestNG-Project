package testScripts;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import common.reusable;
import pageObject.Google_Page;


public class GoogleTest {
	private WebDriver driver=null;
	private reusable reu;
	private Google_Page GP;


	@BeforeClass
	public void setUp(){
		reu=new reusable();
		GP = new Google_Page();
		driver = reu.createDriverInstance();
		driver.get(reu.getGlobalData("google_url"));
	}
	@Test
	public void test_theLogo(){
		Assert.assertTrue(driver.findElement(GP.google_logo()).isDisplayed());
	}
	@Test
	public void test_the_SearchTextBox(){
		Assert.assertTrue(driver.findElement(GP.google_search_Box()).isDisplayed());
		Assert.assertTrue(driver.findElement(GP.google_logo()).isDisplayed());
	}
	@Test
	public void title_url(){
		Assert.assertEquals("Google" , driver.getTitle());
		Assert.assertEquals("https://www.google.com/" , driver.getCurrentUrl());
		Assert.assertTrue(driver.findElement(GP.google_logo()).isDisplayed());
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
