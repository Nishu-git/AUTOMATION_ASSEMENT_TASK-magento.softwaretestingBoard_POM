package LUNA_SIGNup_TESTcases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfigure;

public class Baseclass {

	static WebDriver driver;
	
	ReadConfigure configs = new ReadConfigure();
	
	String urlame = configs.getUrl();
	String firstName = configs.getFisrtname1();
	String lastName = configs.getlastname();
	String eMail = configs.getEmails();
	String paSS = configs.getpass();
	String confoPASS = configs.getConpwd();
	
     @BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(urlame);
		
	}
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(10);
		driver.quit();
	}
}
