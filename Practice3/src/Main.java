
public class Main {

	public static void main(String[] args) {
		Library eunsu = new Library();
		
		eunsu.borrowBook(1);
		eunsu.borrowBook(1);
		
		eunsu.borrowBook(3);
		eunsu.borrowBook(10);
		
		eunsu.returnBook(3);
		eunsu.borrowBook(10);
		 
		eunsu.returnBook(3);
	}

}
