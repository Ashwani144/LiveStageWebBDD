package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.qa.livestage.factory.DriverFactory;
import com.qa.livestage.pageObjects.LoginPage;
import com.qa.livestage.pageObjects.MyAccountPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyAccountPageSteps {

	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	private MyAccountPage accountPage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
	    
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("email");
		String password = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://staging.livestage.stream/login");
		
		accountPage=loginPage.dologin(userName, password);
		
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
	   
		accountPage.getMyAccountPageTitle();
	}

	@Then("page title should  be {string}")
	public void page_title_should_be(String string) {
	   
	}

	@Given("user is on MyAccount page")
	public void user_is_on_my_account_page() {
	    
	}

	@Then("user gets myaccount section")
	public void user_gets_myaccount_section(DataTable dataTable) {
	    
		
	}

	@Then("myaccount section count should be {int}")
	public void myaccount_section_count_should_be(Integer expectedSectionCount) {
		//  Assert.assertTrue(accountPage.getMyAccountsectionCount() == expectedSectionCount);
	}
	
	
	
}
