package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{

	/*
	 * public RemoteWebDriver driver;
	 * 
	 * @Given("Launch the chrome browser") public void launchBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * 
	 * }
	 * 
	 * @Given("Load the application url") public void loadAppUrl() {
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * 
	 * }
	 */

	@Given("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElementById("username").sendKeys(username);

	}

	@Given("Enter the password  as {string}")
	public void enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);

	}

	@When("Click on login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();

	}

	@Then("Homepage should be displayed")
	public void VerifyHomeage() {
		String actTitle = driver.getTitle();
		if (actTitle.contains("TestLeaf")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message is displayed");

	}
	
	
	
	
}
