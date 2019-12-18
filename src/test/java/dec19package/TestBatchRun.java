package dec19package;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="demodec13.feature", glue= { "StepDef13Dec19"},
tags = {"@Credentials"},plugin= {"json:target\\cucumber.report.json"})

public class TestBatchRun {

}
