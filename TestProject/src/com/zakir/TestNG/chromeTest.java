package com.zakir.TestNG;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class chromeTest {


	public void launchWebDriver() {
		File file = new File("S:/Zakir/jre7/bin/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				file.getAbsolutePath());
		WebDriver browser = new ChromeDriver();
	}

}
