package org.techM.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookloginpage {
@FindBy(xpath="//input[@name=\'email\']")
	private WebElement emailID;
	
	
@FindBy(xpath="//input[@type=\"password\"]")
private WebElement password;


@FindBy(xpath="//button[@id=\"loginbutton\"]")
private WebElement loginbutton;

	
	facebookloginpage (WebDriver  driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enteremailID() {
		emailID.sendKeys("velocity");
		
	}
	
	public void enterpassword() {
		password.sendKeys("class123");
	}
public	void clickloginbutton() {
	loginbutton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
