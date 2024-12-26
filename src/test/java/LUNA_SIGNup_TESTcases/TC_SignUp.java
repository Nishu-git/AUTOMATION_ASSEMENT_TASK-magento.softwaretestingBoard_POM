package LUNA_SIGNup_TESTcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import LUNAstore_POM.signUp;

public class TC_SignUp  extends Baseclass{
@Test
	public void sigNup()  {
		signUp signup = new signUp(driver);
		
		signup.clickCreateAnAccount();
		signup.enterFirstName(firstName);
		signup.enterLastName(lastName);
		signup.enterEmail(eMail);
		signup.enterPassword(paSS);
		signup.enterConfirmPassword(confoPASS);
		signup.clickCreateAccountButton();
		
	}

	
	

	
	


}