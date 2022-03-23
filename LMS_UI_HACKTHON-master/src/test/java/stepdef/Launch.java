package stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	WebDriver driver;
	@FindBy(how = How.LINK_TEXT, using = "btnLogin")
	WebElement login;

	public Launch() {
		super();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		this.driver = driver;
	}
	@Given("Admin User is on LMS portal with Login button Link")
	public void admin_user_is_on_lms_portal_with_login_button_link() {
		driver.get("https://www.LMS-UI.com/home");
	}

	@When("Admin User clicks on Login button link")
	public void admin_user_clicks_on_login_button_link() {
		// admin clicks on login button
		login.click();

	}

	@Then("Admin user navigates to Log-In Screen page")
	public void admin_user_navigates_to_log_in_screen_page() {

		// landing on login page
		driver.get("https://www.LMS-UI.com/login");

	}

}
