package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome,driver","S:\\\\Testing\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.id("src"));
		from.sendKeys("Madurai");
		Thread.sleep(2000);
		WebElement to=driver.findElement(By.id("dest"));
		to.sendKeys("Chennei");
		Thread.sleep(2000);
		//WebElement date=driver.findElement(By.id("onwardCal"));
		//date.sendKeys("3 Jan 2025");
		//Thread.sleep(2000);
		//WebElement year=driver.findElement(By.className("yearText"));
		//year.sendKeys("2025");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//button[@id='search_button']"));
		search.click();

	}

}
