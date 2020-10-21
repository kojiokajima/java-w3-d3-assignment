
public class Driver {
	
	public static void printStudents(Student[] studArray) {
		for (int i = 0; i < studArray.length; i++) {
			System.out.println(studArray[i].getFirstName() + " " + studArray[i].getLastName());
		}
	}
	
	public static void printBook(Book[] bookArr) {
		for (int j = 0; j < bookArr.length; j++) {
			System.out.println("Title: " + bookArr[j].getTitle() + "\t" + "Author: " + 
				bookArr[j].getFirst() + " " + bookArr[j].getLast() + "\t" + "Year of Publication: " + bookArr[j].getYear());
		}
	}
	
	public static void main(String[] args) {
//		Student[] studentArray = new Student[3];
//		
//		studentArray[0]= new Student(null, "");
//		studentArray[1] = new Student("Jane", "Dew");
//		studentArray[2] = new Student("Albert", "Dao");	
//		
//		printStudents(studentArray);
//		
//		studentArray[0].setFirstName("John");
//		studentArray[0].setLastName("Doe");
//		
//		System.out.println("\nPrinting the student after the update");
//		printStudents(studentArray);
		
		
		
		Book[] bookArray = new Book[3];
		
		bookArray[0] = new Book("Blacklist", "Patric", "Jane", 2008);
		bookArray[1] = new Book("Mentalist", "Raymond", "Reddington", 2013);
		bookArray[2] = new Book("Top Gun", "Pete", "Michell", 1986);
		
		printBook(bookArray);
		
		bookArray[0].setTitle("Suits");
		bookArray[0].setFirstName("Harvey");
		bookArray[0].setLastName("Spector");
		bookArray[0].setYear(2011);
		
		System.out.println("\nPrinting the student after the update");
		printBook(bookArray);
		
		
//		
//		System.out.println("Title: " + book1.getTitle() + "\tAuthor: " + 
//				book1.getFirst() + " " + book1.getLast() + "\t\tYear of Publication: " + book1.getYear());
//		System.out.println("Title: " + book2.getTitle() +  "\tAuthor: " + 
//				book2.getFirst() + " " + book2.getLast() + "\tYear of Publication: " + book2.getYear());
//		System.out.println("Title: " + book3.getTitle() + "\t\tAuthor: " + 
//				book3.getFirst() + " " + book3.getLast() + "\t\tYear of Publication: " + book3.getYear());

	}

}
