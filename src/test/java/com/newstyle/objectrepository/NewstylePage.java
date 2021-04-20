package com.newstyle.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.newstyle.resources.CommonActions;


public class NewstylePage extends CommonActions {

	public NewstylePage() {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebElement getSetupicon() {
		return setupicon;
	}

	public void setSetupicon(WebElement setupicon) {
		this.setupicon = setupicon;
	}
	public WebElement getUsername() {
		return username;
	}
	
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	
	public WebElement getConfiguration() {
		return configuration;
	}

	public void setConfiguration(WebElement configuration) {
		this.configuration = configuration;
	}
	
	public WebElement getConfigurationbutton() {
		return configurationbutton;
	}

	public void setConfigurationbutton(WebElement configurationbutton) {
		this.configurationbutton = configurationbutton;
	}
		
	public WebElement getTypeconfiguration() {
		return typeconfiguration;
	}

	public void setTypeconfiguration(WebElement typeconfiguration) {
		this.typeconfiguration = typeconfiguration;
	}

	public WebElement getNewstyle() {
		return newstyle;
	}

	public void setNewstyle(WebElement newstyle) {
		this.newstyle = newstyle;
	}

	public WebElement getEnternewstyle() {
		return enternewstyle;
	}

	public void setEnternewstyle(WebElement enternewstyle) {
		this.enternewstyle = enternewstyle;
	}
	public WebElement getSave() {
		return save;
	}

	public void setSave(WebElement save) {
		this.save = save;
	}


	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	@FindBy(name="Password")
	private WebElement pass;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	@FindBy(xpath="//*[text()='Centric 8']")
	private WebElement setupicon ;
	@FindBy(xpath="//*[text()='build']")
	private WebElement configuration ;
	@FindBy(xpath="//a[text()='System Configuration']")
	private WebElement configurationbutton ;
	@FindBy(xpath="(//span[@class='MuiTab-wrapper'])[19]")
	private WebElement typeconfiguration ;
	@FindBy(xpath="//div[text()='add']/parent::div")
	private WebElement newstyle ;
	@FindBy(xpath="(//input[@type='text'])[35]")
	private WebElement enternewstyle ;
	@FindBy(xpath="//span[text()='Save']")
	private WebElement save ;
		
	
	
		
	}
		

	
	


