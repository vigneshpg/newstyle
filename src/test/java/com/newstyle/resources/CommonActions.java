package com.newstyle.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	public static WebDriver driver;
	public WebDriver launch(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		return driver;
		}
	public void write(WebElement ele,String value) {
		ele.sendKeys(value);

	}
	public void button(WebElement ele) {
		ele.click();
		

	}
	public WebElement activeElement() {

		WebElement activeElement = driver.switchTo().activeElement();

		return activeElement;

	}

	public void eletobeclickable(WebElement ele) {
		ele.click();
		

	}
	
}