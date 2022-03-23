import java.io.*;
public class Console {
	public static void main(String...args) {
	 java.io.Console c=System.console();
	 System.out.println("Password:");
	 char[]ch=c.readPassword();
	 String password=String.valueOf(ch);
	 System.out.println(password);
		
	}

}
