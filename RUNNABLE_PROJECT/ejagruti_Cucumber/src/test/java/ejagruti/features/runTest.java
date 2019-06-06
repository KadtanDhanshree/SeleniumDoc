//package ejagruti.finsys.modules;
package ejagruti.features;
import org.junit.runner.RunWith; 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
//features = {"src/test/resources/FeatureCollections/1.Login.feature"},
//tags={"@ValidUserInvalidPswd"}
//features = {"src/test/resources/FeatureCollections/2.CreateCompany.feature"},
//tags={"@CreateCompanyHappyPath"}
features = {"src/test/resources/FeatureCollections"},
tags={"@HappyPath"}
)

public class runTest 
{
	
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