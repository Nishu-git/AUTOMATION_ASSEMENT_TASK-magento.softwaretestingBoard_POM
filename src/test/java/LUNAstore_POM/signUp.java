package LUNAstore_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUp {

	 WebDriver ldriver;
	  WebDriver driver;
	  
	  
	    public signUp(WebDriver driver) {
	    	this.driver=driver;
	    	 PageFactory.initElements(driver, this); 
	    	 
	    	 }
	    /*public void   signUp(WebDriver rdriver) {
		    	ldriver =rdriver;
		    	PageFactory.initElements(rdriver,this);
		    }
	    */
	    @FindBy(linkText="Create an Account")
	    WebElement createanAcount;
	    
	    @FindBy(name ="firstname")
	    WebElement firstname;
	    
	    @FindBy(name ="lastname")
	    WebElement lastname;
	    
	    @FindBy(name ="email")
	    WebElement email;
	    
	    @FindBy(name ="password")
	    WebElement password;
	    
	    @FindBy(name ="password_confirmation")
	    WebElement passwordConform;
	    
	    @FindBy(xpath ="//*[@id=\"form-validate\"]/div/div[1]/button")
	    WebElement createaccontBTN;
	    
	    public void clickCreateAnAccount() { 
	    	createanAcount.click();
	    	} 
	    
	    
	    public void enterFirstName(String fname) {
	    	firstname.sendKeys(fname); }
	    
	    public void enterLastName(String lname) { 
	    	lastname.sendKeys(lname); 
	    	}
	    
	    public void enterEmail(String mail) { 
	    	email.sendKeys(mail); 
	    	} 
	    
	    public void enterPassword(String pwd) { 
	    	password.sendKeys(pwd);
	    	}
	    
	    public void enterConfirmPassword(String confirmPwd) { 
	    	passwordConform.sendKeys(confirmPwd);
	    	} 
	    
	    public void clickCreateAccountButton() {
	    	createaccontBTN.click(); 
	    	}
	    
	    
	    	
}
