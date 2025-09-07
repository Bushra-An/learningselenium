package Maventest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class saucelabtest {
	
	RemoteWebDriver driver;

	@Test(priority= 1)
	public void LoginApp() throws MalformedURLException {
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap();
		sauceOptions.put("username", "oauth-bushraanjum16.hkbk-5d245");
		sauceOptions.put("accessKey", "32e6a92d-d79d-41cc-8b55-ce0ee88f7bbb");
		sauceOptions.put("build", "selenium-build-9PFE1");
		sauceOptions.put("name", "regression");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		 driver = new RemoteWebDriver(url, browserOptions);
	         

		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		// enter username

		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter password

		driver.findElement(By.name("password")).sendKeys("admin123");

		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Test(priority= 2)
	public void searchUser() {
		driver.findElement(By.linkText("Leave")).click();
	boolean isdisplay =	driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")).isDisplayed();
	Assert.assertTrue(isdisplay);

	}

	@Test(priority= 3)
	public void logout() {

		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.findElement(By.linkText("Logout")).click();

	}

}
