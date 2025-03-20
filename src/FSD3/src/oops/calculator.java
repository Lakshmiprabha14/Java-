package oops;

import java.util.Scanner;
class Cac {
	int inp1,inp2,tot;
	void add() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value:");
		inp1=s1.nextInt();
		System.out.println("Enter value:");
		inp2=s1.nextInt();	
		tot=inp1+inp2;
		System.out.println("Total:"+tot);
	}

public class calculator {
		public static void main(String [] args) {
			Cac c = new Cac();
			c.add();
		}


}
}
