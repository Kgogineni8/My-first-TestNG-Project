package testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Priority_Learning_TC_05 {

	
	@BeforeClass
	public void lanuch_application() {
		
    System.out.println("Launching the application");

	}
	
	@Test(priority=2)
	
	public void homepage_validation() {
		System.out.println("Testing homepage");
		
	}
	
@Test(priority=1)
	
	public void signin_validation() {
		System.out.println("Testing Sign in page");
		
	}
	
@Test(priority=0)

   public void signup_validation() {
	System.out.println("Testing Sign up page");
	
}
@Test(priority=3)

     public void cartpage_validation() {
	System.out.println("Testing cart page");
	
}

@AfterClass

    public void close_application() {
	System.out.println("Closing Application");
	
}

}
