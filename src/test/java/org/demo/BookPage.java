package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends BaseClass {
	
	public BookPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;

	@FindBy(id="cc_num")
	private WebElement Ccn;
	
	@FindBy(id="cc_type")
	private WebElement CcType;
	
	@FindBy(id="cc_exp_month")
	private WebElement CcMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement Ccyear;
	
	@FindBy(id="cc_cvv")
	private WebElement CcVv;
	
	@FindBy(id="book_now")
	private WebElement booking;

	public WebElement getBooking() {
		return booking;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCcn() {
		return Ccn;
	}

	public WebElement getCcType() {
		return CcType;
	}

	public WebElement getCcMonth() {
		return CcMonth;
	}

	public WebElement getCcyear() {
		return Ccyear;
	}

	public WebElement getCcVv() {
		return CcVv;
	}
}
