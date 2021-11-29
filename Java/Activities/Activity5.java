package fst_b17;

abstract class Book {

	String title;
	abstract void setTitle(String s);
	
	String getTitle() {
		return title;
	}
}

//class MyBook extends Book {
//	public void setTitle(String s) {
//		title = s;
//	}
//}

public class Activity5 extends Book{
	public static void main(String[] args) {
		String title = "Java";
//		Book book1 = new MyBook();
		
//		book1.setTitle(title);
		
		
		Activity5 newBook = new Activity5();
		newBook.setTitle(title);
//		System.out.println("The title is: " + newBook.getTitle());
		System.out.println("The title is: " + title);
	}
	
	public void setTitle(String s) {
		title = s;
	}
}


