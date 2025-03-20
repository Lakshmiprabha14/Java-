package fsd2;

public class stringbuildermethod {
         public static void main(String [] args) {
		
		//append
		StringBuilder str= new StringBuilder("Hello");
		str.append("World");
		System.out.println("After appending :"+ str);
		
		//insert
		
		str.insert(3,"  ");
		System.out.println("After inserting :"+ str);
		//reverse
		str.reverse();
		System.out.println("After reversing :"+ str);
  
         //replace
        str.replace(0,3,"A");
 		System.out.println("After replacing :"+ str);
}
}