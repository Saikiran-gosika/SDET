package runner;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"},  features={"feature"}, glue="StepDef") 

public class runTest { }
