package fsd1;
import java.util.*;

public class Fibonacci {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(fibonacci(i));
		}
	}
  public static int fibonacci(int n) {
	  if (n <= 1) {
          return n;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);
}
}
