package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	public static WebDriver driver;
	@Before
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	@Test
	public void text() throws InterruptedException {
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("Lokesh");
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("Asdfg@1234");
		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();

	}
	//@Ignore
	@After
	public void quitBrowser() {
		driver.quit();

	}

}
