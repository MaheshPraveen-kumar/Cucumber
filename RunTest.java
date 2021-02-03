package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features= {"src/test/java/features"}, 
					glue= "steps", 
					monochrome = true,
					publish = true)
public class RunTest extends AbstractTestNGCucumberTests {
	

}
