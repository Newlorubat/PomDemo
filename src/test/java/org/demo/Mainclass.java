package org.demo;

public class Mainclass extends BaseClass {

	public static void main(String[] args) {

		launchbrowser();

		loadurl("https://adactin.com/HotelApp/index.php");
		// LoginPage
		LoginPage login = new LoginPage();
		SearchPage search = new SearchPage();
		SelectPage select = new SelectPage();
		BookPage book = new BookPage();
		BookingConfirmation confirm = new BookingConfirmation();
		fill(login.getUser(), "newlonrubat");
		fill(login.getPass(), "5ZAD05");
		click(login.getLogins());

		// SearchPage
		waits();
		select(search.getLoc(), "Melbourne");
		select(search.getHotel(), "Hotel Hervey");
		select(search.getRoomtype(), "Double");
		select(search.getRoomno(), "3 - Three");
		select(search.getAdult(), "3 - Three");
		select(search.getChild(), "1 - One");
		click(search.getSubmit());

		// SelectPage
		waits();
		click(select.getOptions());
		click(select.getContinues());

		// BookPage
		waits();
		fill(book.getFirstName(), "Giridharan");
		fill(book.getLastName(), "Rangaswamy");
		fill(book.getAddress(), "Thanjavur");
		fill(book.getCcn(), "1897676565656565");
		select(book.getCcType(), "Master Card");
		select(book.getCcMonth(), "February");
		select(book.getCcyear(), "2020");
		fill(book.getCcVv(), "144");
		click(book.getBooking());

		// Confirmation
		waits();
		System.out.println(texts(confirm.getOrderNum()));

	}

}
