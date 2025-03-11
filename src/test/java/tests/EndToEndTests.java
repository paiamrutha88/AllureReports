package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class EndToEndTests {
	
	WebDriver driver;
	String url ="https://www.saucedemo.com/";
	@Epic("SauceLabs tests")
	@Feature("Login tests")
	@Story("Login")
	@Severity(SeverityLevel.BLOCKER)
	@Test
	public void loginTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}
	
	@Test
	public void testTwo()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void testThree()
	{
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
