package com.newstyle.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.newstyle.resources.CommonActions;


public class NewstylePage extends CommonActions {
	public NewstylePage() {
		PageFactory.initElements(driver,this);
	}
	

	
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	@FindBy(name="Password")
	private WebElement pass;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	@FindBy(xpath="//a[@class='csi-anchor-reset csiLogoText']")
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
	@FindBy(xpath="//span[text()='Style']")
	private WebElement stylebutton;
	@FindBy(xpath="//div[text()='New Season']")
	private WebElement newseason ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[18]")
	private WebElement enterseason ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[19]")
	private WebElement entercode ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[20]")
	private WebElement enterdescription ;
	@FindBy(xpath="//span[text()='Save & Go']")
	private WebElement saveandgo ;
	@FindBy(xpath="(//div[text()='New Brand'])[1]")
	private WebElement newbrand ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[9]")
	private WebElement brandname ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[10]")
	private WebElement brandcode ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[11]")
	private WebElement branddescription ;
	@FindBy(xpath="//span[text()='Save & Go']")
	private WebElement saveandgo2 ;
	@FindBy(xpath="(//div[text()='New Department'])[1]")
	private WebElement newdepartment ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[9]")
	private WebElement enterdepartment ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[10]")
	private WebElement enterdepartmentcode ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[11]")
	private WebElement enterdepartmentdescription ;
	@FindBy(xpath="//span[text()='Save & Go']")
	private WebElement saveandgo3 ;
	@FindBy(xpath="(//div[text()='New Collection'])[1]")
	private WebElement newcollection ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[9]/parent::div")
	private WebElement enternewcollection ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[10]/parent::div")
	private WebElement enternewcollectioncode ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[11]/parent::div")
	private WebElement enternewcollectiondescription  ;
	@FindBy(xpath="//span[text()='Save & Go']")
	private WebElement saveandgo4  ;
	@FindBy(xpath="(//div[text()='New Style'])[1]")
	private WebElement newstylebutton  ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[8]")
	private WebElement styletype  ;
	


	/*FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[9]")
	private WebElement template  ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[10]")
	private WebElement shape  ;
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[11]")
	private WebElement theme  ;*/
	@FindBy(xpath="(//input[@class='dijitReset dijitInputInner'])[12]")
	private WebElement stylebox  ;
	@FindBy(xpath="//span[text()='Save']")
	private WebElement styletypesave   ;
	
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
	public WebElement getstylebutton() {
		return stylebutton;
	}

	public void setStylebutton(WebElement stylebutton) {
		this.stylebutton = stylebutton;
	}

	public WebElement getNewseason() {
		return newseason;
	}

	public void setNewseason(WebElement newseason) {
		this.newseason = newseason;
	}
	public WebElement getEnterseason() {
		return enterseason;
	}
public void setEnterseason(WebElement enterseason) {
		this.enterseason = enterseason;
	}

public WebElement getEntercode() {
	return entercode;
}

public void setEntercode(WebElement entercode) {
	this.entercode = entercode;
}

public WebElement getEnterdescription() {
	return enterdescription;
}

public void setEnterdescription(WebElement enterdescription) {
	this.enterdescription = enterdescription;
}

public WebElement getSaveandgo() {
	return saveandgo;
}

public void setSaveandgo(WebElement saveandgo) {
	this.saveandgo = saveandgo;
}
public WebElement getNewbrand() {
		return newbrand;
	}


	public void setNewbrand(WebElement newbrand) {
		this.newbrand = newbrand;
	}
	public WebElement getBrandname() {
		return brandname;
	}


	public void setBrandname(WebElement brandname) {
		this.brandname = brandname;
	}
	public WebElement getBrandcode() {
		return brandcode;
	}


	public void setBrandcode(WebElement brandcode) {
		this.brandcode = brandcode;
	}

	public WebElement getBranddescription() {
		return branddescription;
	}


	public void setBranddescription(WebElement branddescription) {
		this.branddescription = branddescription;
	}
	public WebElement getSaveandgo2() {
		return saveandgo2;
	}


	public void setSaveandgo2(WebElement saveandgo2) {
		this.saveandgo2 = saveandgo2;
	}

	public WebElement getNewdepartment() {
		return newdepartment;
	}


	public void setNewdepartment(WebElement newdepartment) {
		this.newdepartment = newdepartment;
	}
	public WebElement getEnterdepartment() {
		return enterdepartment;
	}


	public void setEnterdepartment(WebElement enterdepartment) {
		this.enterdepartment = enterdepartment;
	}


	public WebElement getEnterdepartmentcode() {
		return enterdepartmentcode;
	}


	public void setEnterdepartmentcode(WebElement enterdepartmentcode) {
		this.enterdepartmentcode = enterdepartmentcode;
	}


	public WebElement getEnterdepartmentdescription() {
		return enterdepartmentdescription;
	}


	public void setEnterdepartmentdescription(WebElement enterdepartmentdescription) {
		this.enterdepartmentdescription = enterdepartmentdescription;
	}


	public WebElement getSaveandgo3() {
		return saveandgo3;
	}


	public void setSaveandgo3(WebElement saveandgo3) {
		this.saveandgo3 = saveandgo3;
	}
	public WebElement getNewcollection() {
		return newcollection;
	}


	public void setNewcollection(WebElement newcollection) {
		this.newcollection = newcollection;
	}
	public WebElement getEnternewcollection() {
		return enternewcollection;
	}


	public void setEnternewcollection(WebElement enternewcollection) {
		this.enternewcollection = enternewcollection;
	}


	public WebElement getEnternewcollectioncode() {
		return enternewcollectioncode;
	}


	public void setEnternewcollectioncode(WebElement enternewcollectioncode) {
		this.enternewcollectioncode = enternewcollectioncode;
	}


	public WebElement getEnternewcollectiondescription() {
		return enternewcollectiondescription;
	}


	public void setEnternewcollectiondescription(WebElement enternewcollectiondescription) {
		this.enternewcollectiondescription = enternewcollectiondescription;
	}
	public WebElement getSaveandgo4() {
		return saveandgo4;
	}
public void setSaveandgo4(WebElement saveandgo4) {
		this.saveandgo4 = saveandgo4;
	}
public WebElement getNewstylebutton() {
	return newstylebutton;
}


public void setNewstylebutton(WebElement newstylebutton) {
	this.newstylebutton = newstylebutton;
}
public WebElement getStyletype() {
	return styletype;
}


public void setStyletype(WebElement styletype) {
	this.styletype = styletype;
}


/*public WebElement getTemplate() {
	return template;
}


public void setTemplate(WebElement template) {
	this.template = template;
}


public WebElement getShape() {
	return shape;
}


public void setShape(WebElement shape) {
	this.shape = shape;
}


public WebElement getTheme() {
	return theme;
}


public void setTheme(WebElement theme) {
	this.theme = theme;
}*/


public WebElement getStylebox() {
	return stylebox;
}


public void setStylebox(WebElement stylebox) {
	this.stylebox = stylebox;
}


public WebElement getStyletypesave() {
	return styletypesave;
}


public void setStyletypesave(WebElement styletypesave) {
	this.styletypesave = styletypesave;
}












	





	

		
	}
		

	
	


