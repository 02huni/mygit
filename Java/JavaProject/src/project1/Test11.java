package project1;
import java.util.Random;

public class Test11 {
	public static void main(String[] args) {
		Random rand= new Random();
		int test=rand.nextInt(3);
		switch(test) {
		case 0:
			System.out.print("가위");
			break;
		case 1:
			System.out.print("바위");
			break;
		case 2:
			System.out.print("보");
			break;
		}
	}
}
