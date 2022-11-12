package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UserRegistrationStep {
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("user navigate on registration page");
	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	
		List<List<String>>userList=dataTable.asLists(String.class);
		for(List<String> e : userList) {
			System.out.println(e);
		}
	}
	
	@When("user enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
		List<Map<String,String>>userList=dataTable.asMaps(String.class,String.class);
//		System.out.println(userList);
//		System.out.println(userList.get(0).get("firstname"));
		for(Map<String,String>e:userList) {
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
			System.out.println(e.get("email"));
			System.out.println(e.get("phone"));
			System.out.println(e.get("city"));
		}
	  
	}


	@Then("user registration should be successfull")
	public void user_registration_should_be_successfull() {
		System.out.println("user registration should be success");
	}
}
