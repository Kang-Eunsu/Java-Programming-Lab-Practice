public class Library {
	
	Book[] arr = new Book[10];
	
	
	Library(){
	
	for(int i = 0; i < 10; i++)
		arr[i] = new Book();
	
	}

	
	
	void borrowBook(int n) {
		if(arr[n-1].states == true)
			arr[n-1].states = false;
		else
			System.out.println(n + "th book is already borrowed.");
	}
	
	void returnBook(int n) {
		if(arr[n-1].states == true)
			System.out.println(n + "th book is already returned.");
		else
			arr[n-1].states = true;
	}
	
	
	
	public static void main(String[] args) {
	
	}
	
	
}

