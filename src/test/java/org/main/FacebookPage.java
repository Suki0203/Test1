package org.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPage {

	public static void main(String[] args) {
		//browser config
		System.setProperty("webdriver.chrome,driver","S:\\Testing\\chromedriver-win64\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//launch url
		driver.get("https://www.facebook.com/login.php/");
		WebElement txtuser=driver.findElement(By.id("email"));
		txtuser.sendKeys("Lokesh");
		WebElement textpass=driver.findElement(By.name("pass"));
		textpass.sendKeys("Asdfg@1234");
		WebElement btnLogin=driver.findElement(By.name("login"));
		btnLogin.click();
	}

}
