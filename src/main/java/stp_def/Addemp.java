package stp_def;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addemp {
	
	WebDriver driver;
	@Given("^lunch browser$")
	public void lunch_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\com.BDDFramework\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airface.in/airface/");
	}

	@When("^login \"([^\"]*)\" and \"([^\"]*)\" click admin and login button$")
	public void login_and_click_admin_and_login_button(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(arg2);
		driver.findElement(By.xpath("//div[3]//div[1]//input[1]")).click();
		driver.findElement(By.xpath("//input[@id='submit_login']")).click();
	}

	@Then("^clicked toggle and employee and addEmployee button$")
	public void clicked_toggle_and_employee_and_addEmployee_button() throws InterruptedException{
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//a[@class='nav-link sidebartoggler waves-effect waves-light']")).click();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement
				(By.xpath("//a[contains(@class,'waves-effect waves-dark')]//span[contains(text(),'Employee')]"))).click().perform();
		driver.findElement(By.xpath("//a[@class='buttons-copy buttons-html5 btn btn-primary mr-1 mb-2']")).click();
	}

	@Then("^Enter the data \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and location save the employee$")
	public void enter_the_data_and_and_and_and_location_save_the_employee
	(String EmployeeID, String name, String email, String phonenumber){
		driver.findElement(By.id("employeeid")).sendKeys(EmployeeID);
		driver.findElement(By.id("employeename")).sendKeys(name);
		driver.findElement(By.id("employeeemailid")).sendKeys(email);
		driver.findElement(By.id("employeephoneno")).sendKeys(phonenumber);
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='custom-select mb-3']")));
		sel.selectByIndex(1);
		driver.findElement(By.xpath("//button[@name='submit_candidate']")).click();
	}

	@Then("^Verify employee is added or not$")
	public void verify_employee_is_added_or_not() throws InterruptedException{
		List<WebElement> list=driver.findElements(By.xpath("//tr/td[2]"));
		list.stream().filter(s->s.getText().equals("IN_OD_13")).forEach(s->System.out.println(s));
		Thread.sleep(5000);
	}
	
	
}
	


