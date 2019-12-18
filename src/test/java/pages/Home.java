package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home {
	
	WebDriver driver;
	
	public Home(WebDriver driver) {
		
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Signin")
	public static WebElement signin;
	
	@FindBy(name="username")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(name="Login")
	public static WebElement login;
	
	
	@Given("Navigate to home page")
	public void navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b3a.00.35\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Home.signin.click();
		Home.username.sendKeys("mercury");
		Home.password.sendKeys("mercury");
		Home.login.click();
	}

	@Then("user loggrd in Successfully")
	public void user_loggrd_in_Successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		System.out.println("user login successfull");
	}



}

	
