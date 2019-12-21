package Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class test3 {
	WebDriver driver;
	@Given("^I must enter the given URL and be able to navigate to the EDUMA home page\\. I must also be able to hover over the Courses option in the navbar and select Demo Accounts from the dropdown menu\\.$")
	public void i_must_enter_the_given_URL_and_be_able_to_navigate_to_the_EDUMA_home_page_I_must_also_be_able_to_hover_over_the_Courses_option_in_the_navbar_and_select_Demo_Accounts_from_the_dropdown_menu() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\libs\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("http://sethuonline.com/lms/");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement demoAccounts = driver.findElement(By.xpath("//li[@id=\"menu-item-8130\"]/a"));
		action.moveToElement(demoAccounts).build().perform();
		Thread.sleep(1000);
		
	}

	@Then("^I should by default land on the Demo Accounts page\\.$")
	public void i_should_by_default_land_on_the_Demo_Accounts_page() throws Throwable {
		String actual = driver.findElement(By.xpath("//h1[text() = \"Demo Accounts\"]")).getText();
		String expected = "DEMO ACCOUNTS";
		assertEquals(expected, actual);
	}

	@When("^I enter the given the given credentials for learner and instructor profile\\.$")
	public void i_enter_the_given_the_given_credentials_for_learner_and_instructor_profile() throws Throwable {
	    
	}

	@Then("^I should be able to log in succcessfully\\.$")
	public void i_should_be_able_to_log_in_succcessfully() throws Throwable {
	   
	}


}
