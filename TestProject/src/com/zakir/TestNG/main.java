package com.zakir.TestNG;

import org.testng.annotations.Test;

public class main {

	@Test
	public void runChrome() {
		chromeTest c1 = new chromeTest();
		c1.launchWebDriver();
	}
	
	@Test
	public void runFirefox() {
		FirefoxTest c1 = new FirefoxTest();
		c1.launchWebDriver();
	}
	
	@Test
	public void runIE() {
		FirefoxTest c1 = new FirefoxTest();
		c1.navigateTo();
	}
}
