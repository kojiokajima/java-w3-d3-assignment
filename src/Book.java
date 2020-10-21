import javax.sound.midi.VoiceStatus;

public class Book {
	// Instance variables
	private String bookTitle;
	private String authorFirst;
	private String authorLast;
	private int yearOfPublication;
	private double price;
	
	public Book(String title, String authorFName, String authorLName, int year ,double price) {
		
		if (title == "") {
			this.bookTitle = "Unknown";
		} else {
			this.bookTitle = title;			
		}
		if (authorFName == "") {
			this.authorFirst = "John";
		} else {
			this.authorFirst = authorFName;
		}
		if (authorLName == "") {
			this.authorLast = "Doe";
		} else {
			this.authorLast = authorLName;			
		}
		if (year < 1990) {
			this.yearOfPublication = 1990;
		} else {			
			this.yearOfPublication = year;
		}
		if (price <= 0) {
			this.price = 1;
		} else {
			this.price = price;			
		}
	}
	
	
	/*
	 * return book title
	 */
	public String getTitle() {
		return this.bookTitle;
	}
	/*
	 * return first name
	 */
	public String getFirst() {
		return this.authorFirst;
	}
	/*
	 * return last name
	 */
	public String getLast() {
		return this.authorLast;
	}
	/*
	 * return year of publication 
	 */
	public int getYear() {
		return this.yearOfPublication;
	}
	/*
	 * return year of publication 
	 */
	public double getPrice() {
		return this.price;
	}
	
	/*
	 * set book title, first name, last name, and year of publication
	 */
	public void setTitle(String bookTitle) {
		if (bookTitle == "") {
			this.bookTitle = "Unknown";
		} else {			
			this.bookTitle = bookTitle;
		}
	}
	public void setFirstName(String authorFirst) {
		if (authorFirst == "") {
			this.authorFirst = "John";
		} else {			
			this.authorFirst = authorFirst;
		}
	}
	public void setLastName(String authorLast) {
		if (authorLast == "") {
			this.authorLast = "Doe";
		} else {
			this.authorLast = authorLast;			
		}
	}
	public void setYear(int yearOfPublication) {
		if (yearOfPublication < 1990) {
			this.yearOfPublication = 1990;
		} else {			
			this.yearOfPublication = yearOfPublication;
		}
	}
	public void setPrice(double price) {
		if (price <= 0) {
			this.price = 1;
		} else {
			this.price = price;
		}
	}
	
	
	
	public double getTotalPrice() {
		double totalPrice = this.price * 1.12;
		return totalPrice;
	}
	
	

}


// title --> Unknown
// first --> John
// last --> Doe
// year --> <1900 --> 1900