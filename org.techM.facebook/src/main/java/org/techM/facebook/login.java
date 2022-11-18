package org.techM.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	@FindBy(xpath=("//span[@id=\"nav-link-accountList-nav-line-1\"]"))
	private WebElement movetosignin;
	
	@FindBy(xpath="//span[text()=\"Sign in\"]")
	private WebElement clicksinup;
	
	@FindBy(xpath="//input [@type=\"email\"]")private WebElement enterid ;
	
	@FindBy(xpath="//input[@id=\"continue\"]")private WebElement IDsubmit;
	
	@FindBy(xpath="//input[@name=\"password\"]")private WebElement enterpassword;
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")private WebElement passwordsubmit;
	//================================constructor==================================================
	public login (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//==============================================================================
	public void movetosinup(WebDriver driver) {
		movetosignin.click();
	}
	public void enterid() {
		enterid.sendKeys("honmahesh62@gmail.com");
	}
	
	public void IDsubmit() {
		IDsubmit.click();
	}
	public void enterpassword() {
		enterpassword.sendKeys("maheshhon1994");
	}
	public void passwordsubmit() {
		 passwordsubmit.click();
	}
	
	
	
	
}
