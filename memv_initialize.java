package OOPS_base;
import java.util.Scanner;

public class memv_initialize {
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int age = sc.nextInt();
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name and age.");
		memv_initialize ob = new memv_initialize();
		ob.display();

	}

}
