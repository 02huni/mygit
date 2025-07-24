package project1;

import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("몇개의 *을 표시할까요? ");
		int a = in.nextInt();
		for(int i=0;i<a;i++) {
			System.out.print("*");
			if((i+1)%5==0) {
				System.out.println();
			}
		}
		in.close();
	}
}
