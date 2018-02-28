package Scripts;


import org.testng.annotations.Test;
import POM.EnterTimeTrackPage;
import POM.LoginPage;

public class ValidLoginLogout extends BaseTest {
	
	@Test 
	public void testValidLoginLogout(){
		LoginPage l = new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLoginButton();
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.clickLogoutLink();
	}
	

}
