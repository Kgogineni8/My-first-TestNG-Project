package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.reusable;
import pageObject.Stackoverflow_page;

public class StackOverFlow_Test {
	
	public class Stack_Overflow {
		private WebDriver driver=null;
		private reusable reu;
		private Stackoverflow_page SP;


		@BeforeClass
		public void setUp(){
		reu=new reusable();
		SP = new Stackoverflow_page();
		driver = reu.createDriverInstance();
		driver.get(reu.getGlobalData("stackoverflow_url"));
		}
		@Test
		public void Stackoverflow_logo(){
		Assert.assertTrue(driver.findElement(SP.Stackoverflow_logo()).isDisplayed());
		
		
		}
		@Test
		public void stackoverflow_subtabs(){
			
			Assert.assertTrue(driver.findElement(SP.About()).isDisplayed());
			Assert.assertTrue(driver.findElement(SP.Products()).isDisplayed());
			Assert.assertTrue(driver.findElement(SP.Products()).isDisplayed());
			Assert.assertTrue(driver.findElement(SP.Forteams()).isDisplayed());
			Assert.assertTrue(driver.findElement(SP.Search()).isDisplayed());
			driver.findElement(SP.Search()).sendKeys("information");
		    Assert.assertTrue(driver.findElement(SP.Log_in()).isDisplayed());
			Assert.assertTrue(driver.findElement(SP.Sign_up()).isDisplayed());
			System.out.println("Test Pass");
		//
		
		}
		@Test
		public void test_Products(){
		
		
		}
		@AfterClass
		public void tearDown(){
		driver.quit();
		}
		}

	//span[text()='Stack Overflow']
}
