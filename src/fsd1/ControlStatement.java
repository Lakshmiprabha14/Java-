package fsd1;
import java.util.*;

public class ControlStatement {
	public static void main(String [] args) {
		Scanner s1 = new Scanner(System.in);
		/*if(a<b) {
			if(a%2==0) {
				System.out.println(a+"  is a Even number");
			}
			System.out.print("A less than B");
		}
		else {
			System.out.print("B less than A");
		}*/
		/*if(a>b && a>c) {
			System.out.println("A is greater");
		}
			else if(b>a && b>c) {
				System.out.println("B is greater");
			}
			else if(c>a && c>b) {
				System.out.println("c is greater");
			}
		
				else {
					System.out.println("All are equal");
				
			
		}*/
		System.out.println("Enter a number:");
		int a=s1.nextInt();
		System.out.println("Enter a number:");
		int b = s1.nextInt();
		char ch;
		System.out.print("+,-");
		ch=s1.next().charAt(0);
		switch(ch) {
		case '+':
			int c=a+b;
			System.out.print("ADD:"+c);
			break;
		case '-':
			int d=a-b;
			System.out.print("SUB:"+d);
			break;
			default:
				System.out.print("Invalid");
				break;
		}
	}
		
	}


