package com.newstyle.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.newstyle.resources.CommonActions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions {
	@Before()
	public void beforescenario() {
	launch("http://win16sql19-ccd.centricsoftware.com/WebAccess/home.html");
	driver.manage().window().maximize();
}
	@After
	public void afterscenario() {
		driver.close();
	}
}	