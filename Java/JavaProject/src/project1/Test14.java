package project1;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("몇개의 *을 표시할까요? ");
		int a = in.nextInt();
		while(a>0)
		{
			System.out.print("*");
			a--;
		}
		in.close();
	}
}
