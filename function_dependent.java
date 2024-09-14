package OOPS_base;
import java.util.Scanner;
public class function_dependent {
	static public int multiply(int n){
		return 5*n;
	}
	
	static public int subtract(int a, int b) {
		return multiply(a-b);
	}
	
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("Result: "+subtract(a,b));
		
	}
}