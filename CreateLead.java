package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{

		
	@Given("Click crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	
	
}
