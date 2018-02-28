package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.xml.XmlTest;

public class BaseTest {
//	public WebDriver driver;
//	
//	@BeforeClass
//	public void preCondition(){
//		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumWS\\com.testing.www\\drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("http://localhost/login.do");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	}`
//	
//	@AfterClass
//	public void postCondition() {
//		driver.close();
//	}
	
public WebDriver driver;
	
	@BeforeClass
	public void preCondition(XmlTest xmlTest){
		String browser = xmlTest.getParameter("browser");
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWS\\com.testing.www\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumWS\\com.testing.www\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "C:\\SeleniumWS\\com.testing.www\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}	
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void postCondition() {
		driver.close();
	}

}
