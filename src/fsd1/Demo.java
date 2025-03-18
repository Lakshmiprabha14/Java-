package fsd1;
import java.util.Scanner;
public class Demo {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = s.nextLine();
		System.out.println("My name is:"+name);
		System.out.println("Enter mark:");
		int mark = s.nextInt();
		System.out.println("My mark is:"+mark);
		
	}

}
