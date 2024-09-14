package OOPS_base;
import java.util.Scanner;

public interface Sports {
	Scanner sc = new Scanner(System.in);
	int score1 = sc.nextInt();
	int score2 = sc.nextInt();
	
	void inputscores(int score1, int score2);
	
	void display();
}
