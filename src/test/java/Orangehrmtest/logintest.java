package Orangehrmtest;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import OrangehrmPages.login;
import utilitypackage.Excelutility;
import utilitypackage.propertiesutility;

public class logintest extends basetest {
	@Test
	public void loginwithvalidetails() throws InvalidFormatException, IOException {
		login logtest = new login();
		//logtest.logintoapplication(Excelutility.getTestData(1, 0), Excelutility.getTestData(1, 1));
		logtest.logintoapplication(propertiesutility.getData("username"),propertiesutility.getData("password"));
	}
}
