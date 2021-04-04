package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Workspace_Automation\\BDDFrameWork\\Feature\\Login.feature "
		,glue= {"E:\\Workspace_Automation\\BDDFrameWork\\src\\main\\java\\StepDefinitions"}
		//format= {""}
		
		
		)

public class TestRunner {
	
	

}
