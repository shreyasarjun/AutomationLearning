package JenkinsTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlightBooking {
	
	@Test
	public void SimpleProgram() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\22November2017\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//#####################################################################################
		//System.setProperty("webdriver.gecko.driver","C:\\22November2017\\BrowserDrivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//#####################################################################################
		//System.out.println("Welcome to jenkins World with Selenium");
	    //System.setProperty("webdriver.ie.driver","C:\\22November2017\\BrowserDrivers\\iedriverserver.exe");
		//WebDriver driver=new InternetExplorerDriver();
		//#####################################################################################
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys("dfdafda");
        driver.findElement(By.id("passwd")).sendKeys("dfdfds"); 
        driver.findElement(By.id("SubmitLogin")).click();
        
         

	}

}
