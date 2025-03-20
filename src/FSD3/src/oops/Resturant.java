package oops;
import java.util.*;
class food{
	Scanner s=new Scanner(System.in);
	String Dish;
	int quantity;
	int prize;
	void get() {
		System.out.println("Enter dish:");
		Dish=s.nextLine();
		System.out.println("Enter quantity:");
		quantity=s.nextInt();
		System.out.println("Enter prize:");
		prize=s.nextInt();
	}
	
	void show() {
		System.out.println("Dish name:"+Dish);
		System.out.println("Quantity:"+quantity);
		System.out.println("Prize:"+prize);
		
	}
}
public class Resturant {
	public static void main(String [] args) {
		food f = new food();
		f.get();
		f.show();
		
	}

}
