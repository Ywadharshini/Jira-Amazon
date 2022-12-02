package com.cucumber.concepts;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utilityfiles.Utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = ".//FeatureFiles//Amazon.feature",

		glue = "com.stepdefinition",

		dryRun = false,

		monochrome = true,

		publish = true,

		plugin = {

				"html:Reports/Amazon_SearchFunctionality.html", 
				"json:Reports/Amazon_SearchFunctionality.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)
public class Amazon_Testcase {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = Utility_Files.browser_Launch("chrome");

	}

	@AfterClass
	public static void tear_Down() {

		Utility_Files.quitBrowser();
	}

}
