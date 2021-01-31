package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefination"},
monochrome=true,
tags="@API"
//plugin= {"pretty","html:target/reports"}
		)

public class Runner {
	
}
