
public class Driver {
	
	public static void printStudents(Student[] studArray) {
		for (int i = 0; i < studArray.length; i++) {
			System.out.println(studArray[i].getFirstName() + " " + studArray[i].getLastName() + 
					" - Score: " + studArray[i].getTotalScore());
		}
	}
	
	public static void printBook(Book[] bookArr) {
		for (int j = 0; j < bookArr.length; j++) {
			System.out.println("Title: " + bookArr[j].getTitle() + "\tAuthor: " + 
				bookArr[j].getFirst() + " " + bookArr[j].getLast() + "\tYear of Publication: " + 
					bookArr[j].getYear() + "\n\tPrice: $" + bookArr[j].getTotalPrice());
		}
	}
	
	public static void main(String[] args) {
//		Student[] studentArray = new Student[3];
//		
//		studentArray[0]= new Student("John", "Smith");
//		studentArray[1] = new Student("Jane", "Dew");
//		studentArray[2] = new Student("Albert", "Dao");	
//		
//		printStudents(studentArray);
//		
//		studentArray[0].setFirstName("John");
//		studentArray[0].setLastName("Doe");
//		
//		// updating midterm score
//		studentArray[0].setMidTermScore(19.2);
//		studentArray[1].setMidTermScore(19.7);
//		studentArray[2].setMidTermScore(19.5);
//		
//		// updating final score
//		studentArray[0].finalScore(17.7);
//		studentArray[1].finalScore(18.5);
//		studentArray[2].finalScore(17.3);
//		
//		System.out.println("\nPrinting the student after the update");
//		printStudents(studentArray);
		
		
		
		Book[] bookArray = new Book[3];
		
		bookArray[0] = new Book("Blacklist", "Patric", "Jane", 2008, 220.75);
		bookArray[1] = new Book("Mentalist", "Raymond", "Reddington", 2013, 115.98);
		bookArray[2] = new Book("Top Gun", "Pete", "Michell", 1986, 105.49);
		
		printBook(bookArray);
		
		bookArray[0].setPrice(215.75);
		bookArray[1].setPrice(110.98);
		bookArray[2].setPrice(100.49);
		
		System.out.println("\nPrinting the student after the update");
		printBook(bookArray);
		
	}

}
