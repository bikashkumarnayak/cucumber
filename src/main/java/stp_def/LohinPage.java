package stp_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LohinPage {
	WebDriver driver;
	@Given("^User already given page$")
	public void user_already_given_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\com.BDDFramework\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airface.in/airface/");
	    
	}

	@When("^verify log in page$")
	public void verify_log_in_page(){
		String title=driver.getTitle();
		System.out.println(title);
	}

	@Then("^user enter \"(.*)\" and \"(.*)\" and Admin and loginButton$")
	public void user_enter_username_and_password(String username,String password) {
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(password);
		driver.findElement(By.xpath("//div[3]//div[1]//input[1]")).click();
		driver.findElement(By.xpath("//input[@id='submit_login']")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("^verify dashboard$")
	public void verify_dashboard() throws Throwable {
		String text=driver.findElement(By.xpath("//h4[@class='page-title']")).getText();
		System.out.println(text);
		Assert.assertEquals("Dashboard", text);
	    
	}
	@Then("^close the browser$")
	public void threaddown() {
		driver.quit();
	}

}
