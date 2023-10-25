package pageObject;
import org.openqa.selenium.By;


public class Stackoverflow_page {


public By Stackoverflow_logo(){return By.xpath("//span[text()='Stack Overflow']");}
public By About(){return By.xpath("//a[text()='About']");}
public By Products(){return By.xpath("//a[text()='Products']");}
public By Forteams(){return By.xpath("//a[text()='For Teams']");}
public By Search(){return By.xpath("//input[@name='q']");}
public By Log_in(){return By.xpath("//a[text()='Log in']");}
public By Sign_up(){return By.xpath("(//a[text()='Sign up'])[2]");}

}
