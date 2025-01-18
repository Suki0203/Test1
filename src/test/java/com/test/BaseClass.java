package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void url(String url) {
		driver.get(url);

	}
	public static void text(WebElement e,String user) {
		e.sendKeys(user);

	}
	public static void btnclick(WebElement e) {
		e.click();

	}
	public static void quitBrowser() {
		driver.quit();

	}

}
