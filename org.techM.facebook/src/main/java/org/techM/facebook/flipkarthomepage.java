package org.techM.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkarthomepage {
	@FindBy(xpath="//button[text()=\"✕\"]")
	private WebElement cutlogin;
	
	
	
@FindBy(xpath="//input[@placeholder=\'Search for products, brands and more\']")
	private WebElement search;
	
@FindBy(xpath="//input[@type=\"text\"]")
private WebElement searchinput;
	
	
@FindBy(xpath="//button[@type=\"submit\"]")
private WebElement searchclick;
	
	
	flipkarthomepage (WebDriver driver ){
		PageFactory.initElements(driver, this);
	}
public	void cutlogin() {
		cutlogin.click();
	}
	
	public void search() {
	search.click();	
	}
	public void searchinput() {
		searchinput.sendKeys("t-shirt");
	}
	
	public void searchclick() {
		searchclick.click();
	}
	
	
	
	
	
	
	
	
	
}
