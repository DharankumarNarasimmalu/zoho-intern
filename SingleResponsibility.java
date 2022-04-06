package solid;
import java.util.*;
class Book{
	void searchByAuthor(String author,String book) {
		Scanner sc=new Scanner(System.in);
		String authorName=sc.nextLine();
		if(author.equals(authorName)) {
			System.out.println(book+" "+author);
		}
		else {
			System.out.println("no book found");
		}

	}
	void searchByBookname(String book,String author){
		Scanner sc=new Scanner(System.in);
		String bookName=sc.next();
		if(bookName.equals(book)) {
			System.out.println(book+" "+author);
		}
	}
}
class Register{
	String[] bookRegister() {
		Scanner sc=new Scanner(System.in);
		String book=sc.next();
		String author=sc.next();
		String arr[]= {book,author};
		return arr;
	}
	String[] studentRegister() {
		Scanner sc=new Scanner(System.in);
		String studentName=sc.next();
		String bookName=sc.next();
		String dueDate=sc.next();
		String reg[]= {studentName,bookName,dueDate};
		return reg; 
		
	}
}
class PrintDetails{
	void printReceiverDetails(String[] details ) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		if(name.equals(details[1])) {
			for(int i=0;i<3;i++) {
				System.out.print(details[i]+" ");
			}
		}
	}
}
public class SingleResponsibility {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		Map<String,String>books=new HashMap<>();
		books.put("Harry Potter and the Philosopher's Stone","J. K. Rowling");
		books.put("And Then There Were None", "Agatha Christie");
		books.put("Dream of the Red Chamber","Cao Xueqin");
		books.put("The Hobbit", "J. R. R. Tolkien");
		Book searchBook=new Book();
		int searchoption=sc.nextInt();
		if(searchoption==1) {
		for(Map.Entry e:books.entrySet()) {
			searchBook.searchByBookname((String) e.getKey(),(String) e.getValue());}}
		else if(searchoption==2) {
			for(Map.Entry e:books.entrySet()) {
			searchBook.searchByAuthor((String) e.getValue(),(String) e.getKey());
		}}
		Register reg=new Register();
		List<String[]>register=new ArrayList<>();
		int registerOption=sc.nextInt();
		if(registerOption==1) {
			String registration[]=reg.studentRegister();
			register.add(registration);
		}
		else if(registerOption==2){
			String book[]=reg.bookRegister();
			books.put(book[0],book[1]);
		}
		PrintDetails print=new PrintDetails();
		for(String[] s:register) {
		print.printReceiverDetails(s);
		}

	}

}
