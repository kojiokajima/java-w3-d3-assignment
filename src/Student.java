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
	public Student(String firstName, String lastName) {
		if (firstName == "" || firstName == null) {
			this.firstName = "Unknown";
		} else {
			this.firstName = firstName;			
		}
		if (lastName == "" || lastName == null) {
			this.lastName = "Unknown";
		} else {
			this.lastName = lastName;			
		}
	}
	
	/*
	 *  @return first name
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/*
	 *  @return last name
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/*
	 *  Set the first name
	 */
	public void setFirstName(String firstName) {
		if(firstName == "" || firstName == null) {
			this.firstName = "Unknown";
		} else {			
			this.firstName = firstName;	
		}
	}
	
	/*
	 *  Set the first name
	 */
	public void setLastName(String lastName) {
		if (lastName == "" || lastName == null) {
			this.lastName = "Unknow";
		} else {
			this.lastName = lastName;
		}
	}
	
	
	
	
	
	
	
	

}
