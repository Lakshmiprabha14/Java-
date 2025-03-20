package fsd2;
import java.util.*;
public class wrapperclassdemo {
	public static void main(String []args) {
		
		//creation of wrapperclasses
		Integer myInt=Integer.valueOf(100);
		Double myDouble=Double.valueOf(12.34);
		Character myChar=Character.valueOf('A');
		Boolean myBool=Boolean.valueOf(true);
		
		        //autoboxing
				Integer intObj=50;
				//unboxing
				int intValue = intObj;

				System.out.println(intValue);
		
	}

}
