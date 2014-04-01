package CompareRates;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Common.WebDriverFunctions;




public class Main {

	public static WebDriver DRIVER;
	@Before
	public void init() throws IOException {
		String[] cmd = {"killall", "chromedriver"};
		Runtime.getRuntime().exec(cmd);
		setChromeBrowser();
		WebDriverFunctions wdOBJ = new WebDriverFunctions();
		wdOBJ.closePopUpWindows(DRIVER);
		DRIVER.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void setChromeBrowser() {
		File file = new File("../Libraries/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		DRIVER = new ChromeDriver();
		DRIVER.get("http://www.bankrate.com");
		
		//DRIVER.close();
	}

	@Test
	public void CompareRateCase1() {
		CompareRateCases tc1 = new CompareRateCases();
		tc1.getMortgageRates();
		
	}
	
	
	
	@After
	public void de_init() {
		System.out.println("END");
		//DRIVER.close();
	}
	

}