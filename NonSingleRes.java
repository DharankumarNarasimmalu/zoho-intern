package solid;
import java.util.*;
class Library{
	void searchByAuthor(String author,String book,String authorName) {
//		Scanner sc=new Scanner(System.in);
//		String authorName=sc.nextLine();
		if(author.equals(authorName)) {
			System.out.println(book+" "+author);
		}
		else {
			System.out.println("no book found");
		}

	}
	void searchByBookname(String book,String author,String bookName){
//		Scanner sc=new Scanner(System.in);
//		String bookName=sc.next();
		if(bookName.equals(book)) {
			System.out.println(book+" "+author);
		}
	}
	String[] bookRegister() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book name");
		String book=sc.next();
		System.out.println("enter author name");
		String author=sc.next();
		String arr[]= {book,author};
		return arr;
	}
	String[] studentRegister() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name");
		String studentName=sc.next();
		System.out.println("enter book name");
		String bookName=sc.next();
		System.out.println("enter due date");
		String dueDate=sc.next();
		String reg[]= {studentName,bookName,dueDate};
		return reg; 
		
	}
	void printReceiverDetails(String[] details ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name");
		String name=sc.nextLine();
		if(name.equals(details[0])) {
			for(int i=0;i<3;i++) {
				System.out.print(details[i]+" ");
			}
		}
	}
}

public class NonSingleRes {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		Map<String,String>books=new HashMap<>();
		books.put("Harry Potter and the Philosopher's Stone","J. K. Rowling");
		books.put("And Then There Were None", "Agatha Christie");
		books.put("Dream of the RedChamber","Cao Xueqin");
		books.put("The Hobbit", "J. R. R. Tolkien");
		Library libBooks=new Library();
		System.out.println("press 1 to search by name or press 2 to search by author");
		int searchoption=sc.nextInt();
		sc.nextLine();
		if(searchoption==1) {
			System.out.println("enter book name");
			String name=sc.nextLine();
		for(Map.Entry e:books.entrySet()) {
			libBooks.searchByBookname((String) e.getKey(),(String) e.getValue(),name);}}
		
		else if(searchoption==2) {
			System.out.println("enter author name");
			String author=sc.nextLine();
			for(Map.Entry e:books.entrySet()) {
				libBooks.searchByAuthor((String) e.getValue(),(String) e.getKey(),author);
		}}

		List<String[]>register=new ArrayList<>();
		System.out.println("Press 1 for student register or press 2 for book register");
		int registerOption=sc.nextInt();
		if(registerOption==1) {
			String registration[]=libBooks.studentRegister();
			register.add(registration);
		}
		else if(registerOption==2){
			String book[]=libBooks.bookRegister();
			books.put(book[0],book[1]);
		}

		for(String[] s:register) {
			libBooks.printReceiverDetails(s);
		}

	}

}
