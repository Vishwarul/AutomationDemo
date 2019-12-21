package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class test1 {
	WebDriver driver;
	

	@Given("^I launch Chrome browser and open EDUMA Homepage$")
	public void i_launch_Chrome_browser_and_open_EDUMA_Homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\libs\\chromedriver.exe");
		driver = new ChromeDriver ();
		
		driver.get("http://sethuonline.com/lms/");
	    
	}

	@Given("^I click on Courses drop down\\.$")
	public void i_verify_that_the_page_displays_Courses_drop_down() throws Throwable {
		
		Actions action = new Actions(driver);
		WebElement coursesElement = driver.findElement(By.xpath("//*[@id=\"menu-item-8148\"]/a"));
		action.moveToElement(coursesElement).build().perform();
	}

	@When("^I click on the Courses dropdown i should be able to see Other Free Type\\.$")
	public void i_click_on_the_Courses_dropdown_i_should_be_able_to_see_Other_Free_Type() throws Throwable {
	   String expected = "Other Free Type";
	   Thread.sleep(1000);
	   String actual = driver.findElement(By.xpath("//li[@id =\"menu-item-8145\"]/a")).getText();
			   assertEquals(expected, actual);
	}

	@When("^I click on Other Free Type$")
	public void i_click_on_Other_Free_Type() throws Throwable {
	    driver.findElement(By.xpath("//li[@id =\"menu-item-8145\"]/a")).click();
	    
	}

	@Then("^I should land on the Techonology page\\.$")
	public void i_should_land_on_the_Techonology_page() throws Throwable {
	   String expected = "TECHNOLOGY";
	   Thread.sleep(1000);
	   String actual = driver.findElement(By.xpath("//h2[text() = \"Technology\"]")).getText();
	   assertEquals(expected, actual);
	}
	@Then("^I should be able to see Teacher, Categories and Review\\.$")
	public void i_should_be_able_to_see_Teacher_Categories_and_Review() throws Throwable {
		String teacher = "Teacher";
	    String actualTeacher = driver.findElement(By.xpath("//div[@id=\"lp-single-course\"]/div[1]/div[1]/div/label")).getText();
	    assertEquals(teacher, actualTeacher);
	    String categories = "Categories";
	    String actualCategories = driver.findElement(By.xpath("//div[@id=\"lp-single-course\"]/div[1]/div[2]/label")).getText();
	    assertEquals(categories, actualCategories);
	    String review = "Review";
	    String actualReview = driver.findElement(By.xpath("//div[@id=\"lp-single-course\"]/div[1]/div[3]/label")).getText();
	    assertEquals(review, actualReview);
	}

	@Then("^I also be able to see Description, Curriculum, Instructors and Review relating to the course\\.$")
	public void i_also_be_able_to_see_Description_Curriculum_Instructors_and_Review_relating_to_the_course() throws Throwable {
		String description = "Description";
	    String actualDescription = driver.findElement(By.xpath("//div[@id=\"course-landing\"]/div[1]/ul/li[1]/a/span")).getText();
	    assertEquals(description, actualDescription);
	    String curriculum = "Curriculum";
	    String actualCurriculum = driver.findElement(By.xpath("//*[@id=\"course-landing\"]/div[1]/ul/li[2]/a/span")).getText();
	    assertEquals(curriculum, actualCurriculum);
	    String instructors = "Instructors";
	    String actualInstructors = driver.findElement(By.xpath("//div[@id=\"course-landing\"]/div[1]/ul/li[3]/a/span")).getText();
	    assertEquals(instructors, actualInstructors);
	    String review = "Review";
	    String actualReview = driver.findElement(By.xpath("//div[@id=\"course-landing\"]/div[1]/ul/li[4]/a/span")).getText();
	    assertEquals(review, actualReview);
	}

	@Then("^I should see You May Like section\\.$")
	public void i_should_see_You_May_Like_section() throws Throwable {
		String youMayLike = "YOU MAY LIKE";
		String actual = driver.findElement(By.xpath("//div[@id=\"lp-single-course\"]/div[5]/h3")).getText();
		assertEquals(youMayLike, actual);
	    
	}

	@Then("^I should be able to see links to All Courses, Latest Courses and an advertisement\\.$")
	public void i_should_be_able_to_see_links_to_All_Courses_Latest_Courses_and_an_advertisement() throws Throwable {
		String allCourses = "ALL COURSES";
		String actual = driver.findElement(By.xpath("//aside[@id = \"course-categories-2\"]/div/h4")).getText();
		assertEquals(allCourses, actual);
		String latestCourses = "LATEST COURSES";
		String actual1 = driver.findElement(By.xpath("//aside[@id=\"courses-5\"]/div/h4")).getText();
		assertEquals(latestCourses, actual1);
		assertTrue(driver.findElement(By.xpath("//aside[@id=\"single-images-5\"]")).isDisplayed());
	}
	
	
}
	