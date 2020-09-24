package com.selenium.cucumbertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/com/selenium/features",plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/report.html"}, glue={"com.selenium.steps"})
public class RunCucumberTest {

}
