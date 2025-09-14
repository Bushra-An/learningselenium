package OrangehrmPages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orangehrmtest.basetest;
import Organgehrmreport.ExtentReportUtils;


public class login{
	
	@FindBy(name ="username")
	WebElement Usertxtname;
	
	@FindBy(name = "password")
	WebElement Passtxtword;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement btn;
	
	public login() {
		PageFactory.initElements(basetest.driver, this);
		
	}
	Logger log = LogManager.getLogger(login.class);

	
	public void logintoapplication(String username , String password ) {
		Usertxtname.sendKeys(username);
		log.info("Username is entered in username text box");
		ExtentReportUtils.addStep("Username is entered");

		Passtxtword.sendKeys(password);
		log.info("Pssword is entered in Password text box");
		ExtentReportUtils.addStep("Password is entered");
		
		btn.click();
		log.info("Login button is clicked.");
		ExtentReportUtils.addStep("Login button is clicked");

		
	}
	

}
