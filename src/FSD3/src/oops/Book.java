package oops;
import java.util.*;

class Book{
	int bookid,price;
	String title,author;

	Book(int bookid,int price, String title, String author){
		this.bookid= bookid;
		this.price=price;
		this.title=title;
		this.author=author;
		
	}
	void display() {
		System.out.println("Book id:"+bookid);
		System.out.println("Book price:"+price);
		System.out.println("Book Title:"+title);
		System.out.println("Book author:"+author);
	}
	public class Bookex {
		public static void main (String [] args) {
			Book b = new Book(12,789,"C++","bala");
			b.display();
			}
		}

}

