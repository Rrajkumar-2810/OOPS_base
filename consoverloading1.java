package OOPS_base;
// Constructor Overloading Problem
public class consoverloading1 {
// Program to write all the 4 people who are going to enjoy their evening in a bar,
// some of them drink heavy and some light and some just for the taste and feel of it, using constructor overloading.
	public static void main(String[] args) {
		
		drink d1 = new drink(8); // Drunker1
		drink d2 = new drink("Whisky");// Drunker2
		drink d3 = new drink(7,"Wine");// Drunker3
		drink d4 = new drink(5,"Rum");// Drunker4
		
		d1.all();
		d1.feel();
		d1.slow();
		d1.heavy();
		System.out.println();
		d2.all();
		d2.feel();
		d2.slow();
		d2.heavy();
		System.out.println();
		d3.all();
		d3.feel();
		d3.slow();
		d3.heavy();
		System.out.println();
		d4.all();
		d4.feel();
		d4.slow();
		d4.heavy();
	}
}
class drink{
	int shots;
	String name;
	drink(int s){
		shots = s;
	}
	drink(int s1, String n){
		shots = s1;
		name =n;
	}
	drink(String n1){
		name = n1;
	}
	void heavy() {
		System.out.println("Sure i can drink as many as "+shots+" shots in large amounts but only my favourite "+name+" brand.");
	}
	void slow() {
		System.out.println("I'm a slow drinker guys. Sure the shots are on me, but i'm going to enjoy my "+shots+" slowly.");
	}
	void feel() {
		System.out.println("I think I'm going to enjoy my "+name+" with taking the feel of it.");
	}
	void all() {
		System.out.println("I'm going to drink all the "+shots+" drinks you have at your disposal man. Bring it on.");
	}
}