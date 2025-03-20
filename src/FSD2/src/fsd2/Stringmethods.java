package fsd2;
import java.util.*;
public class Stringmethods {
	public static void main(String [] args) {
		//string creation
		/*String name = new String("Laksh");
		System.out.print(name);*/
		
		//user input
		/*Scanner s = new Scanner(System.in);
		System.out.print("Enter name:");
		String name=s.nextLine();
		System.out.print(name);*/
		
		//length
		
		/*String name="Java programming";
		System.out.println(name.length());*/
		
		//substring
		
		/*System.out.println(name.substring(3));
		System.out.println(name.substring(3,10));*/
		
		//index of 
		/*String str = "Java programing";
		System.out.print(str.indexOf("ming"));*/
		
		//uppercase lowercase
		//String str="Java programming";
		/*System.out.print(str.toUpperCase());
		System.out.print(str.toLowerCase());*/
		
		//replace 
		//System.out.print(str.replace('a','A'));
		
		//equals
		/*String str="JAVA";
		String str1="java";
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));*/
		
		//charAt
		/*String str1="java";
		System.out.println(str1.charAt(3));*/
		
		//convert string to array
		/*String str1="java,springboot,string";
		String []languages =str1.split(",");
		for(String s1:languages) {
		System.out.println(s1);
		}*/
		
		//concatenate
		/*String str1="java";
		String str="Programming";
		System.out.print("Concat string :"+str1.concat(str));*/
		
		//trim
		/*String str="   java    ";
		System.out.println(str.length());
		String str1=str.trim();
		System.out.println(str1);
		System.out.print(str1.length());*/
		
		//comapreto
		
		/*String str="Java";
		String str1="Programming";
		System.out.print(str.compareTo(str1));*/
		
		//conatins
		/*String str="Java Programming";
		System.out.print(str.contains("Java"));*/
		
		//intern
		String s1=new String("JavaDeveloper");
		String s2="JavaDeveloper";
		String s3=s1.intern();
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
	}

}
