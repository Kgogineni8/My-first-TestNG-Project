package testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Test_suite {
	@BeforeSuite
	public void lanuch_application() {
		
    System.out.println("Launching the application");

	}
	
	@AfterSuite

    public void close_application() {
	System.out.println("Closing Application");
	
}

}
