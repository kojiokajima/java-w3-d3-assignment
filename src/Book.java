
public class Book {
	// Instance variables
	private String bookTitle;
	private String authorFirst;
	private String authorLast;
	private int yearOfPublication;
	
	public Book(String title, String authorFName, String authorLName, int year) {
		
		if (title == "") {
			bookTitle = "Unknown";
		} else {
			bookTitle = title;			
		}
		if (authorFName == "") {
			authorFirst = "John";
		} else {
			authorFirst = authorFName;
		}
		if (authorLName == "") {
			authorLast = "Doe";
		} else {
			authorLast = authorLName;			
		}
		if (year < 1990) {
			yearOfPublication = 1990;
		} else {			
			yearOfPublication = year;
		}
	}
	
	
	/*
	 * return book title
	 */
	public String getTitle() {
		return bookTitle;
	}
	
	/*
	 * return first name
	 */
	public String getFirst() {
		return authorFirst;
	}
	
	/*
	 * return last name
	 */
	public String getLast() {
		return authorLast;
	}
	
	/*
	 * return year of publication 
	 */
	public int getYear() {
		return yearOfPublication;
	}
	
	/*
	 * set book title, first name, last name, and year of publication
	 */
	public void setTitle(String bTitle) {
		if (bTitle == "") {
			bookTitle = "Unknown";
		} else {			
			bookTitle = bTitle;
		}
	}
	public void setFirstName(String fName) {
		if (fName == "") {
			authorFirst = "John";
		} else {			
			authorFirst = fName;
		}
	}
	public void setLastName(String lName) {
		if (lName == "") {
			authorLast = "Doe";
		} else {
			authorLast = lName;			
		}
	}
	public void setYear(int yearPub) {
		if (yearPub < 1990) {
			yearOfPublication = 1990;
		} else {			
			yearOfPublication = yearPub;
		}
	}
	
	

}


// title --> Unknown
// first --> John
// last --> Doe
// year --> <1900 --> 1900