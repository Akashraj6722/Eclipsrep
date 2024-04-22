import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
        
		String name;
		String ans;
		String bookName;
		String authorName;
		String bookId;
		String name1;
		String phone;
		
		
		
		String regex="[a-zA-Z]{1,10}";
		String regex1="[0-9]{1,5}";
		String regex3="[689]{1}[0-9]{9}";

		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Number of BOOKS available:10");
				
		System.out.println("Enter  YOUR NAME:");
		name=input.next();
		while(!name.matches(regex)) {
			System.out.println("Enter the VALID  NAME:");
			name=input.next();

		}
		
		System.out.println("Are you a membership holder?");
		ans=input.next();
		while(ans.equals("no")) {
			System.out.println("GET A MEMBERSHIP IN OUR LIBRARY");
			
			System.out.println("SIGNUP");
			System.out.println("Enter the NAME");
			name1=input.next();
			while(!name1.matches(regex)) {
				System.out.println("Enter the VALID NAME:");
				name1=input.next();

			}
			System.out.println("Enter the MOBILE number");
			phone=input.next();
			while(!phone.matches(regex3)) {
				System.out.println("Enter the  VALID MOBILE number:");
				phone=input.next();

			}
			
			System.out.println("SIGNED UP SUCCESFULLY");
			
			break;
		}
		
		System.out.println("Enter the BOOK NAME:");
		bookName=input.next();
		while(!bookName.matches(regex)) {
			System.out.println("Enter the VALID BOOK NAME:");
			bookName=input.next();

		}
		
		
		System.out.println("Enter the AUTHOR NAME:");
		authorName=input.next();
		while(!authorName.matches(regex)) {
			System.out.println("Enter the VALID AUTHOR NAME:");
			authorName=input.next();

		}
		
		System.out.println("111-PS\n"+"112-Half girlfriend\n"+"113-anime");
		

		System.out.println("Enter the BOOK ID:");
		bookId=input.next();
		while(!bookId.matches(regex1)) {
			System.out.println("Enter the VALID  BOOK ID:");
			bookId=input.next();

		}
		
		switch(bookId) {
		
		case("111"):
			
			System.out.println("Available");
		     break;
		
        case("112"):
			
			System.out.println(" NOT Available");
            break;
        
         case("113"):
			
			System.out.println("Available");
			break;
		
		}
		
		Library lib=new Library();
		
		lib.setName(name);
		lib.setAuthorName(authorName);
		lib.setBookName(bookName);
		lib.setAuthorName(authorName);
		lib.setBookId(bookId);
		
		
		
		
		System.out.println(lib.toString());
		
		
		
		
		
		
		
	}

}
