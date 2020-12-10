package com.demo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public void invoke() {
		driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
	}

}
