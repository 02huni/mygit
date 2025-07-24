package project1;
import java.util.Random;
import java.util.Scanner;
public class Test20 {

	public static void main(String[] args) {
		Random rand= new Random();
		Scanner in = new Scanner(System.in);
		System.out.print("인덱스 수:");
		int index = in.nextInt();
		for(int i=0;i<index;i++) {
			int t=rand.nextInt(10)+1;
			int[] testarray= {t};
			System.out.println("a["+i+"]="+t);
		}
		in.close();
	}

}
