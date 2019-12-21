package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
public class test2 {
	WebDriver driver;
	@Given("^I navigate to the EDUMA home page\\.$")
	public void i_navigate_to_the_EDUMA_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\libs\\chromedriver.exe");
		driver = new ChromeDriver ();
		
		driver.get("http://sethuonline.com/lms/");
	}
	@When("^I hover on the Courses dropdown I should be able to see Other Paid Type\\.$")
	public void i_hover_on_the_Courses_dropdown_I_should_be_able_to_see_Other_Paid_Type() throws Throwable {
		Actions action1 = new Actions(driver);
		WebElement coursesElement1 = driver.findElement(By.xpath("//*[@id=\"menu-item-8148\"]/a"));
		action1.moveToElement(coursesElement1).build().perform();
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.xpath("//li[@id = \"menu-item-8146\"]/a")).isDisplayed());
	}

	@When("^I click on Other Paid Type$")
	public void i_click_on_Other_Paid_Type() throws Throwable {
		driver.findElement(By.xpath("//li[@id = \"menu-item-8146\"]/a")).click();
		Thread.sleep(1000);
	}

	@Then("^I should land on the Techonology page once again\\.$")
	public void i_should_land_on_the_Techonology_page_once_again() throws Throwable {
		String actual = driver.findElement(By.xpath("//div[@id=\"main-content\"]/section/div/div/div/div/h2")).getText();
		String expected = "TECHNOLOGY";
		assertEquals(expected, actual);
	}

	@Then("^Below the course title I should be able to see Teacher, Categories, Reviews, Course Fee and Buy This Course options\\.$")
	public void below_the_course_title_I_should_be_able_to_see_Teacher_Categories_Reviews_Course_Fee_and_Buy_This_Course_options() throws Throwable {
		assertTrue(driver.findElement(By.xpath("//div[@class = \"author-contain\"]/label")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[@class = \"course-categories\"]/label")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[@class = \"course-review\"]/label")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[@id=\"lp-single-course\"]/div[2]/div/div")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//button[@class = \"button purchase-button thim-enroll-course-button\"]")).isDisplayed());
	}

	@Then("^I should also be able to see Description, Curriculum, Instructor and Reviews relating to the course\\.$")
	public void i_should_also_be_able_to_see_Description_Curriculum_Instructor_and_Reviews_relating_to_the_course() throws Throwable {
		assertTrue(driver.findElement(By.xpath("//span[text() = \"Description\"]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//span[text() = \"Curriculum\"]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//span[text() = \"Instructors\"]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//span[text() = \"Review\"]")).isDisplayed());
	}

	@Then("^On the right side of the page I should be able to see links to All Courses, Latest Courses and an advertisement\\.$")
	public void on_the_right_side_of_the_page_I_should_be_able_to_see_links_to_All_Courses_Latest_Courses_and_an_advertisement() throws Throwable {
		assertTrue(driver.findElement(By.xpath("//h4[text() = \"All Courses\"]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//h4[text() = \"Latest Courses\"]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//aside[@id=\"single-images-5\"]/div/div/a/img")).isDisplayed());
	}

	
}
