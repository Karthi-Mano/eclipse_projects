import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TrainBetweenStations {

	public static WebDriver browser;
	

	@BeforeTest
	public void init() {
		browser = new FirefoxDriver();
		browser.get("file:///Users/admin/Dropbox/Files/Nasir/irctc/IndianRail%20Enquiry%20System.html");

		//assertTrue(browser.findElement(By.id("t1")).getText(), "");
		//assertEquals(isTextPresent(browser.findElement(By.id("t1")).getText()));
		
	}
	
	@Test
	public void getAvailability() {
		
	}
	
	@AfterTest
	public void deInit() {
		browser.close();
	}
	
	@SuppressWarnings("finally")
	public boolean isTextPresent(String txtValue){
        boolean b = false;
    try{
        b = browser.getPageSource().contains(txtValue);
        return b;
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }     
    finally{
     return b;
    }
}
	
}
