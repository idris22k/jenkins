package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",glue= {"com.stepdefination"}, monochrome = true, snippets = SnippetType.CAMELCASE, strict = true, plugin = { "pretty", "html:src\\test\\ressources\\reports"})
public class TestRunnerClass {


	
}
