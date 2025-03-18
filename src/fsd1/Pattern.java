package fsd1;

public class Pattern {
	//right angle
	public static void main(String[] args) {
        int n = 5; 

        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* ");
            }
            System.out.println();
        }
        //left angle
        for (int i = n; i >= 1; i--) { 
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
