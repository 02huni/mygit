package project1;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 a: ");
		int a = in.nextInt();
		System.out.print("정수 b: ");
		int b = in.nextInt();
		if (a>b) {
			do {
				int i=a--;
				System.out.print("\n"+i);
			}while(a>=b);
		}
		else {
			do {
				int i=b--;
				System.out.print("\n"+i);
			}while(b>=a);
		}
		in.close();
	}
}
