package LMS_UI_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Main Runner class to run all cucumber feature files
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/lms_ui_features", glue = { "Launch",
		"stepdef" }, monochrome = true, dryRun = false, plugin = { "pretty", "html:Reports/report.html" }

)
public class LMS_UI_Runner {

}