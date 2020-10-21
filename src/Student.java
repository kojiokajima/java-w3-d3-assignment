/* basic requirement for the class
 * Instance Variables
 * Constructor
 * Getter Methods
 * Setter Methods
 */


public class Student {
	// Instance variables
	private String firstName;
	private String lastName;
	
	
	// default constructor
	public Student(String fName, String lName) {
		if (fName == "" || fName == null) {
			firstName = "Unknown";
		} else {
			firstName = fName;			
		}
		if (lName == "" || lName == null) {
			lastName = "Unknown";
		} else {
			lastName = lName;			
		}
	}
	
	/*
	 *  @return first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/*
	 *  @return last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/*
	 *  Set the first name
	 */
	public void setFirstName(String fName) {
		if(fName == "" || fName == null) {
			firstName = "Unknown";
		} else {			
			firstName = fName;	
		}
	}
	
	/*
	 *  Set the first name
	 */
	public void setLastName(String lName) {
		if (lName == "" || lName == null) {
			lastName = "Unknow";
		} else {
			lastName = lName;
		}
	}
	
	
	
	
	
	
	
	

}
