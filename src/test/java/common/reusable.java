package common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.FileReader;
import java.util.Properties;

public class reusable {

	public WebDriver createDriverInstance(){

		WebDriver driver = new ChromeDriver();
		return driver;
	}


	public String getGlobalData(String key){
		String value = null;
		try {
			FileReader reader = new FileReader("C:\\Eclipse Project\\Test.Learning.Selenium\\testData.properties");
			Properties prop = new Properties();
			prop.load(reader);
			value = prop.getProperty(key);
		}
		catch(Exception e){}


		return value;
	}


}
