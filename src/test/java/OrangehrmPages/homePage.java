package OrangehrmPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orangehrmtest.basetest;
import Organgehrmreport.ExtentReportUtils;

public class homePage {

	@FindBy(xpath ="//span[@class='oxd-userdropdown-tab']")
	WebElement userprofile;

	@FindBy(linkText = "Logout")
	WebElement logoutbtn;

	public homePage() {
		PageFactory.initElements(basetest.driver, this);
	}
	
	public void logoutfromapp() {
		userprofile.click();
		ExtentReportUtils.addStep("Userprofile is clicked");
		logoutbtn.click();
		ExtentReportUtils.addStep("logged out from application");
	}

}
