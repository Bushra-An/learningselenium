package Maventest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
  
public class firsttest {
	
	public static ChromeDriver driver;
	@Test(priority= 1)
	public void LoginApp() {
		

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
