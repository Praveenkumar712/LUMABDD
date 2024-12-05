package test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "C:\\Users\\Shreyaksha\\eclipse-workspace\\Qualintia_\\src\\test\\java\\luma_features",
		
		glue="step_Defination",
		
		plugin= {"pretty",
				"html:Reports/newreport1.html",
				"json:Reports/newreport1.json",
				"rerun:target/rerun.txt",    //Mandatory to capture failures
		}
		)
public class Runner_class {

}
