package stepdefinitions;

import org.junit.Assert;

import com.qa.livestage.factory.DriverFactory;
import com.qa.livestage.pageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private static String title;
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	@Given("user is on login page")
	public void user_is_on_login_page()
	{
		DriverFactory.getDriver().get("https://staging.livestage.stream/login");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	  
	    title=loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		
		
		Assert.assertTrue(title.contains(expectedTitleName));
		
	}

	@Then("forgot password Link should be display")
	public void forgot_password_link_should_be_display() {
	   
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	  loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	  loginPage.enterPassword(password);
	}
	
	@When("user clicks on cookies button")
	public void user_clicks_on_cookies_button() {
	   loginPage.clickOncookies();
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	   loginPage.clickOnLogin();
	}
	
}
