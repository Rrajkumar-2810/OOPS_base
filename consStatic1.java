package OOPS_base;
// Constructor Static Keyword Problem
class hotel{
	int room;
	String name;
	static String hotelname = "Ashiana";
	
	hotel(int r, String n){
		room = r;
		name = n;
	}
	
	void display() {
		System.out.println("My name is "+name+" and I am staying in "+hotelname+" hotel in room no "+room+".");
	}
}

public class consStatic1 {
// Program to check whether static variable is unique or same for everyone using Constructor.
	public static void main(String[] args) {
		
		hotel p1 = new hotel(308,"Satyam");// p1- Person1
		hotel p2 = new hotel(202,"Raghav");// p2- Person2
		hotel p3 = new hotel(405,"Sanket");// p3- Person3
		p1.display();
		p2.display();
		p3.display();
		p1.hotelname = "Khawab";
		System.out.println();
		System.out.println("Let's see the name of the hotel has changed for everyone or for just the person1.");
		System.out.println();
		p1.display();
		p2.display();
		p3.display();
	}
}
