package StepDef13Dec19;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DefineStep {
	WebDriver driver;
	
	
	@Test
	public void i_have_chosen_to_sign_up() {
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		

	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	
	@Given("Online store is open")
	public void online_store_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("sara purchased a {int}microwave")
	public void sara_purchased_a_microwave(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("she has a recipt")
	public void she_has_a_recipt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("sara returns damaged micriwave")
	public void sara_returns_damaged_micriwave() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("sara should get{int} refund")
	public void sara_should_get_refund(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("mike purchasesd a gift vocher")
	public void mike_purchasesd_a_gift_vocher() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("Mike provides customerdetails")
	public void mike_provides_customerdetails(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		
		List<String> lcoll = dataTable.asList();
		System.out.println(lcoll.size());
		
		for(int i=0;i<lcoll.size()-1;i++)
			
		{
			
	   String lname =lcoll.get(i).toString();
	   System.out.println(lname);
			
		}
		
		
	}





	
}
