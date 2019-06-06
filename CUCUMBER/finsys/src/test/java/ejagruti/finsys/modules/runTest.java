package ejagruti.finsys.modules;

import org.junit.runner.RunWith; 

import cucumber.api.CucumberOptions;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
features = {"src/test/resources/FeatureCollections"},
tags={"@SmokeTest"}
)
public class runTest {
}
/*
@RunWith(Cucumber.class) 
@CucumberOptions.Options(format = {"pretty", "html:target/html"},
features = {"FeatureCollections"},
tags={"@SmokeTest"}
	) 
public class runTest {

}
*/