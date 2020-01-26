package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BaseClass {
	
	public SelectPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement options;
	
	@FindBy(id="continue")
	private WebElement continues;

	public WebElement getOptions() {
		return options;
	}

	public WebElement getContinues() {
		return continues;
	}
	

}
