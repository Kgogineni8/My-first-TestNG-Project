package testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class Groups_Learning_TC_6 {

	
	//@BeforeClass
	//@BeforeGroups("regression")
	@BeforeSuite
	public void lanuch_application() {
		
    System.out.println("Launching the application");

	}
	
	@Test(groups= {"regression"})
	
	public void homepage_validation() {
		System.out.println("Testing homepage");
		
	}
	
@Test(groups= {"regression"})
	
	public void signin_validation() {
		System.out.println("Testing Sign in page");
		
	}
	
@Test(groups= {"smoke"})

   public void signup_validation() {
	System.out.println("Testing Sign up page");
	
}
@Test(groups= {"e2e"})

     public void cartpage_validation() {
	System.out.println("Testing cart page");
	
}

//@AfterClass
//@AfterGroups
@AfterSuite

    public void close_application() {
	System.out.println("Closing Application");
	
}

}
