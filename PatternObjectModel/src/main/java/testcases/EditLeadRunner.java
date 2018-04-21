package testcases;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features/EditLead.feature", glue = {"Hooks","pages"}, monochrome = true)

public class EditLeadRunner {

}
