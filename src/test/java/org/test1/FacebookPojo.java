package org.test1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass;

public class FacebookPojo extends BaseClass {
	public FacebookPojo() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="email")
	private List<WebElement> textuser;
	
	@FindBy(id="pass")
	private List<WebElement> textpass;
	
	@FindBy(name="login")
	private List<WebElement> btnlog;

	public List<WebElement> getTextuser() {
		return textuser;
	}

	public List<WebElement> getTextpass() {
		return textpass;
	}

	public List<WebElement> getBtnlog() {
		return btnlog;
	}

}
