package demoCum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class DemJen {
	WebDriver driver;
	

@Given("TestMe is up and running")
public void testme_is_up_and_running() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
    driver = new ChromeDriver();
	  
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}

@Then("registered user enter the valid creds")
public void registered_user_enter_the_valid_creds() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
	driver.findElement(By .linkText("SignIn")).click();
	driver.findElement(By .name("userName")).sendKeys("Christ");
	driver.findElement(By .name("password")).sendKeys("Christ123");
	driver.findElement(By .name("Login")).click();
	
}

@Then("verifies for the login status for his cred")
public void verifies_for_the_login_status_for_his_cred() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	String act = driver.findElement(By .linkText("SignOut")).getText();
	String exp = "SignOut";
	Assert.assertEquals(act, exp);
	
}


}
