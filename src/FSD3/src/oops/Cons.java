package oops;
class car{
	String brand;
	String color="red";
	car(){   //defualt constructor
		brand = "unknown";
	}
	car(String color){
	 this.color=color;
	}
	void display() {
		System.out.println("Car Name :"+brand);
		System.out.println("Color :"+color);
	}
}
public class Cons {
	public static void main(String[] args) {
		car c = new car(); // called default
		c.display();
	}

}
