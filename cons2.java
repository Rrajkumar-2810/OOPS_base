package OOPS_base;

public class cons2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		student s2 = new student();
		s1.display();
		s2.display();
	}
}

class student{
		int id;
		String name;
		void display() {
			System.out.println("My id is "+id+" and my name is "+name);
		}
}