package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	public static WebDriver driver;
	@Test(priority=0)
	private void Launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	@Test(priority=1)
	private void text() {
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("Lokesh");
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("Asdfg@1234");
		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();

	}
	@Test(priority=2)
	private void quitBrowser() {
		driver.quit();

	}

}
