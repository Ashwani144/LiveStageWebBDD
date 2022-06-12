package com.qa.livestage.testRunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		 plugin = {"pretty" , "rerun:target/failedrerun.txt"},
		 monochrome = true,
		 features = { "@target/failedrerun.txt" },
	     glue = {"stepdefinitions", "AppHooks"}
  
		)


public class FailedRun extends AbstractTestNGCucumberTests{

	/*@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	*/
	
}
