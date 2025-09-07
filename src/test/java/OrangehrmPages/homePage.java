package OrangehrmPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Orangehrmtest.basetest;

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
		logoutbtn.click();
	}

}
