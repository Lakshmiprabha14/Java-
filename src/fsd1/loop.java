package fsd1;

public class loop {
	public static void main(String [] args) {
		//for loop
		/*int n=10;
		for(int i=1;n>=i;n--) {
			if(n%2!=0) {
			System.out.println(n);
			}
		}*/
		//while loop
		/*int n=10;
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}*/
		//do while loop
		/*int i=1;
		int n=10;
		do {
			i++;
			System.out.print(i);
			
		}while(i<=n);*/
		//array
		
		int [] num = new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
