package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import junit.framework.Assert;

public class CucumberJava {

	public static WebDriver driver = null;

	@Given("^I have open the browser$")
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SaikiranGosika\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("^the user launched the \"([^\"]*)\"$")
	public void the_user_launched_the(String arg1) throws InterruptedException {
		driver.get(arg1);
		Thread.sleep(10000);

	}

	@Then("^user login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_using_admin_and_admin_(String username, String password) {
		driver.findElement(By.id("login")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("form-login_submitAuth")).click();

	}
	
	@Given("^Click on Create a Course link$")
	public void Click_on_Create_a_Course_link() {
		driver.findElement(By.xpath("//*[contains(text(),'Create a course')]")).click();
	    
	}

	@Given("^Enter valid credential in Course name textbox \"([^\"]*)\"$")
	public void Enter_valid_credential_in_Course_name_textbox(String arg1) {
	    
		driver.findElement(By.id("update_course_title")).sendKeys(arg1);
	}

	@Then("^Click on Advanced Settings button$")
	public void Click_on_Advanced_Settings_button() {
	    
	    
	}

	@Then("^Select Valid credentials from Category list box \"([^\"]*)\"$")
	public void Select_Valid_credentials_from_Category_list_box(String arg1) {
	    
		driver.findElement(By.id("visual_code")).sendKeys(arg1);
	}

	@Then("^Enter valid credential in Course code textbox \"([^\"]*)\"$")
	public void Enter_valid_credential_in_Course_code_textbox(String arg1) {
	    
		driver.findElement(By.id("visual_code")).sendKeys(arg1);
	}

	@Then("^Select Valid credentials from Language list box \"([^\"]*)\"$")
	public void Select_Valid_credentials_from_Language_list_box(String arg1) {
	    
	    Select s = new Select(driver.findElement(By.xpath("//*[@id='update_course_category_code']")));
	    s.selectByVisibleText("Projects (PROJ)");
	}

	@Then("^Click on Create this course button$")
	public void Click_on_Create_this_course_button() {
	    
		driver.findElement(By.id("update_course_submit")).click();  
	}

	@Then("^click on Add an introduction icon$")
	public void click_on_Add_an_introduction_icon() throws InterruptedException {
	    
		Thread.sleep(3000);
	    
	}

	@Then("^Enter valid credentials in textbox \"([^\"]*)\"$")
	public void Enter_valid_credentials_in_textbox(String arg1) {
		driver.findElement(By.id("course-search-keyword")).sendKeys(arg1);
		driver.findElement(By.id("search_simple_submit")).click();  
		
	    
	}

	@Then("^Click on Save intro text$")
	public void Click_on_Save_intro_text() {
	    String element = driver.findElement(By.xpath("//*[@id=\"course-list\"]/tbody/tr[2]/td[2]/a")).getText();
	    Assert.assertEquals("selenium871", element);
	    
	}


	
	
}
