package com.zakir.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirefoxTest {

	WebDriver browser; 
	public void launchWebDriver() {
		browser = new FirefoxDriver();
	}
	public void navigateTo() {
		browser = new FirefoxDriver();
		browser.get("http://www.cnico.com");
	}
}
