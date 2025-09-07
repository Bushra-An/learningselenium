package Orangehrmtest;

import org.testng.annotations.Test;

import OrangehrmPages.homePage;

public class homepagetest  extends basetest{
	
	@Test
	public void testlogout() {
		homePage hp = new homePage();
		hp.logoutfromapp();
	}

}
