package org.main;

import org.test1.FacebookPojo;

import com.test.BaseClass;

public class MainMethods1 extends BaseClass{

	public static void main(String[] args) {
		launchBrowser();
		maximize();
		url("https://www.facebook.com/");
		FacebookPojo f=new FacebookPojo();
		text(f.getTextuser().get(0),"Lokesh");
		text(f.getTextpass().get(0),"Asdfg@1234");
		btnclick(f.getBtnlog().get(0));
		quitBrowser();

	}

}
