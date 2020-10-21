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
	private double midTermScore; // 30%
	private double finalScore; // 70%
	
	
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
		this.midTermScore = 0;
		this.finalScore = 0;
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
	 *  @return  midterm score
	 */
	public double getMidtermScore() {
		return this.midTermScore;
	}
	/*
	 *  @return final score
	 */
	public double getFinalScore() {
		return this.finalScore;
	}
	
	
	/*
	 *  Set the first name
	 *  @param first name
	 */
	public void setFirstName(String firstName) {
		if(firstName == "" || firstName == null) {
			this.firstName = "Unknown";
		} else {			
			this.firstName = firstName;	
		}
	}
	
	/*
	 *  Set the last name
	 *  @param last name
	 */
	public void setLastName(String lastName) {
		if (lastName == "" || lastName == null) {
			this.lastName = "Unknow";
		} else {
			this.lastName = lastName;
		}
	}
	
	/*
	 * Set the midterm score
	 * @param midterm score
	 */
	public void setMidTermScore(double midTermScore) {
		this.midTermScore = midTermScore;
	}
	/*
	 * Set the final score
	 * @param final score
	 */
	public void finalScore(double finalScore) {
		this.finalScore = finalScore;
	}
	
	/*
	 * calculate total score
	 * @return total score
	 */
	public double getTotalScore() {
		double totalScore = (this.midTermScore * 0.3) + (this.finalScore * 0.7);
		return totalScore;
	}
	
	
	
	
	

}
