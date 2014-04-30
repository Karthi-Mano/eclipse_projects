package com.zakir.TestNG;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerTest {

	public void launchWebDriver() {
		File file = new File("S:/Zakir/jre7/bin/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver browser = new InternetExplorerDriver();
	}

}
