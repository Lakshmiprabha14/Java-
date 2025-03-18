package fsd1;
import java.util.*;

public class PrimeNumber {
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number:");
		int num=s.nextInt();
		if(isPrime(num)) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
	}

	private static boolean isPrime(int num) {
		if(num<=2) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		// TODO Auto-generated method stub
		return true;
	}

}
