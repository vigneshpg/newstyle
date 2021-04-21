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
	
		Thread.sleep(3000);
	  c.button(n.getSetupicon());
	  c.button(n.getConfiguration());
	  c.button(n.getConfigurationbutton());
	  Thread.sleep(3000);
	  c.button(n.getTypeconfiguration());
	  System.out.println("cilick configuration button sucessfully ");
	  }
	@When("user create the style type {string}")
	public void user_create_the_style_type(String string) throws InterruptedException {
		Thread.sleep(7000);
		c.button(n.getNewstyle());
		
		WebElement activeElement = n.activeElement();
		c.write(activeElement,"styletypeA");
		  c.button(n.getSave());
	}


	
	@When("user fill the style attribute fields")
	public void user_fill_the_style_attribute_fields() {
		
	    List<WebElement> checkbox = driver.findElements(By.xpath("(//input[@type='checkbox'])[33]"));
	      for (int i = 0; i <checkbox.size(); i--) {
	    	WebElement tick = checkbox.get(i);
	    	tick.click();
	    	System.out.println(checkbox.get(i).getText());
			
		}
	     
	  }
	
	@Given("user launches centric application")
	public void user_launches_centric_application1() {
		h.beforescenario();
		
	   	}
	
	
	@When("user go to home page")
	public  void user_go_to_home_page() {
		 c.button(n.getSetupicon());
	}

	@When("user create the new season")
	public void user_create_the_new_season() throws InterruptedException {
	   
	    c.button(n.getstylebutton());
	    c.button(n.getNewseason());
	    Thread.sleep(3000);
	    WebElement activeElement = n.activeElement();
	    c.write(activeElement,"season");
	    c.write(n.getEntercode(), "12345");
	    c.write(n.getEnterdescription(),"demo43");
	    c.button(n.getSaveandgo());
	    }
	@When("user creates new brand")
	public void user_creates_new_brand() {
	c.button(n.getNewbrand());
    c.write(n.getBrandname(),"peter england");
    c.write(n.getBrandcode(), "3456");
    c.write(n.getBranddescription(), "Demo2");
    c.button(n.getSaveandgo2());
    }
	@When("user creates new department")
	public void user_creates_new_department() {
		c.button(n.getNewdepartment());
		c.write(n.getEnterdepartment(), "shirt");
		c.write(n.getEnterdepartmentcode(), "36");
		c.write(n.getEnterdepartmentdescription(), "epic");
		c.button(n.getSaveandgo3());
		
	    	}

	
	@When("user creates new collection")
	public void user_creates_new_collection() {
	    c.button(n.getNewcollection());
	    c.write(n.getEnternewcollection(), "allensolly");
	    c.write(n.getEnternewcollectioncode(), "12345");
	    c.write(n.getEnternewcollectiondescription(),"visual");
	    c.button(n.getSaveandgo4());
	}
	@When("user create new style")
	public void user_create_new_style() {
	c.button(n.getNewstylebutton());
	c.write(n.getStyletype(), "Apparel colour and size");
	/*c.write(n.getTemplate(),"tre");
	c.write(n.getShape(), "rectangle");
	c.write(n.getTheme(), "black");*/
	c.write(n.getStylebox(), "flip");
	c.button(n.getStyletypesave());
	}
}
