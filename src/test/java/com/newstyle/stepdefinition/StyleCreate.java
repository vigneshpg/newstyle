package com.newstyle.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.newstyle.objectrepository.NewstylePage;
import com.newstyle.resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StyleCreate extends CommonActions {
	CommonActions c = new CommonActions();
	Hooks h = new Hooks();
	NewstylePage n = new NewstylePage();
	@Given("user launches centric application")
	public void user_launches_centric_application() {
		h.beforescenario();
		
	   	}
	@Given("user enter the login credential to login")
	public void user_enter_the_login_credential_to_login() {
		c.write(n.getUsername(), "Administrator");
		c.write(n.getPass(), "centric8");
		c.button(n.getLogin());
		System.out.println("login sucessfully");
		
	}

	@Given("user click on setup icon")
	public void user_click_on_setup_icon() throws InterruptedException {
		Thread.sleep(1000);
	  c.button(n.getSetupicon());
	  c.button(n.getConfiguration());
	  c.button(n.getConfigurationbutton());
	  Thread.sleep(3000);
	  c.button(n.getTypeconfiguration());
	  System.out.println("cilick configuration button sucessfully ");
	  }

	@When("user create the style type {string},{string}")
	public void user_create_the_style_type(String styleA) throws InterruptedException {
		Thread.sleep(7000);
		c.button(n.getNewstyle());
		 c.write(n.getEnternewstyle(),"styleA"); 
		  c.button(n.getSave());
		 
	  
	}

	@When("user fill the style attribute fields")
	public void user_fill_the_style_attribute_fields() {
		
	    List<WebElement> checkbox = driver.findElements(By.xpath("//td[text()='Apparel - Color and Size']/following-sibling::td/child::div/child::div"));
	    
	    for (int i = 0; i <checkbox.size(); i++) {
	    	WebElement tick = checkbox.get(i);
	    	tick.click();
			
		}
	}



}
