package org.techM.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonhome {
	@FindBy(xpath=("//span[@id=\"nav-link-accountList-nav-line-1\"]"))
	private WebElement movetosignin;
	@FindBy(xpath="//span[text()=\"Sign in\"]")
	private WebElement clicksinup;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	
	 private WebElement searchclick;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	
	 private WebElement searchinput ;
	
	@FindBy(xpath="//input[@id=\'nav-search-submit-button']")
	
	 private WebElement searchclick2 ;
	
	public amazonhome (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void searchclick () {
		searchclick.click();
	}
	
	
	public void searchinput () {
		searchinput.sendKeys("tshirts");
	}
	
	
	public void searchclick2 () {
		searchclick2.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
