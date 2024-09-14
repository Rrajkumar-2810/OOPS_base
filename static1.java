package OOPS_base;
// Program to call a static method in the main method.
// Non-static method and variable cannot be called in the static void main method as it will throw an error.
public class static1 {
	static int area(int x, int y) {
		return x*y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = static1.area(5, 7);
		System.out.println("Area of the rectangle is: "+result);
	}
}
