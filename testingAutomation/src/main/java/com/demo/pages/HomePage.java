package com.demo.pages;


import org.openqa.selenium.WebDriver;

public class HomePage {

	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}
	
	public String Title() {
		return driver.getTitle();
	}
}
