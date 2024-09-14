package OOPS_base;
// Using multiple void methods to check whether some method throws an error or not when some methods 
// are taking only one input although two parameters are passed in everyone one of the constructors called.  
public class cons3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dancer d1 = new dancer(456123,"Lily");
		dancer d2 = new dancer(789123,"Rose");
		dancer d3 = new dancer(1245678,"Jasmine");
		d1.display();
		d1.call();
		d1.time();
		System.out.println();
		d2.display();
		d2.call();
		d2.time();
		System.out.println();
		d3.display();
		d3.call();
		d3.time();
	}
}
class dancer {
	int number;
	String name;
	dancer(int nu, String na){
		number = nu;
		name = na;
	}
	void display() {
		System.out.println("My phone number is "+number+" and my name is "+name+".");
	}
	void call() {
		System.out.println("Call on my number "+number+" when you have time.");
	}
	void time() {
		System.out.println("Contact me when you are free. You can call me by my name "+name+".");
	}
}