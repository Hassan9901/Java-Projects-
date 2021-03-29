import java.util.Scanner;


public class Menu {

public static void main(String[] args) throws Exception {
//	BookSearch bs=new BookSearch();
	Scanner input=new Scanner(System.in);
//	System.out.println("Enter title of book");
//	String title=input.next();
//	bs.setTitle(title);
//	bs.searchBook();
	
	
	System.out.println("1: Search book \n2: Checkout Book\n3: Return Book");
	int choice=input.nextInt();
	while (choice>0&&choice<4) {
		if (choice==1) {
			BookSearch bs=new BookSearch();
			
			System.out.println("Enter title of book");
			String title=input.next();
			bs.setTitle(title);
			bs.searchBook();
		}else if (choice==2) {
			BookCheckout bookcheck=new BookCheckout();
			System.out.println("Enter Book id:");
			String id=input.next();
			bookcheck.setBookid(id);
			if(bookcheck.isAvailable())
			{
				System.out.println("enter Mmeber id");
				int memId=input.nextInt();
				while (memId<1000||memId>9999) {
					System.out.println("enter Mmeber id");
					memId=input.nextInt();
					
				}
				bookcheck.checkOut(memId);
				bookcheck.log();
			}
			else {
				System.out.println("Not Available");
			}
		}else if (choice ==3) {
			BookReturn b=new BookReturn();
			System.out.println("Enter the id of book that you want to return:");
			String id= input.next();
			b.setBookid(id);
			if (!(b.isAvailable())) {
				b.returnBook();
				b.log();
			}else {
				System.out.println("Book is already available");
			}
		}
		System.out.println("1: Search book \n2: Checkout Book\n3: Return Book");
		choice=input.nextInt();
		
		
	}
	
	
	
	
	
}
}
