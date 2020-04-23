package testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/SHREE/eclipse-workspace/cucumber/src/test/java/features/bddtest.feature",
		glue= {"gluecode"}
	)

public class TestRunner {
	@AfterClass
	public static void check() {
		System.out.print("Hi This is first program.");
	}
}
