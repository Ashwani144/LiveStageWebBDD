package com.qa.livestage.testRunners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.CucumberFeatureWrapper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = {"src/test/resources/MyFeatures/LoginPage.feature"},
		   glue = {"stepdefinitions", "AppHooks"},
		   plugin = {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"timeline:test-output-thread/","rerun:target/failedrerun.txt"}
		)

public class MYTestRunnerUsingTestNG extends AbstractTestNGCucumberTests
{
    
    
}  
    
