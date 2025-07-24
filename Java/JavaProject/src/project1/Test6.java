package project1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("변수 A: ");
		int a = in.nextInt();
		System.out.print("변수 B: ");
		int b = in.nextInt();
		if (a%b==0) {
			System.out.println("B는 A의 약수다");
		}
		else {
			System.out.println("B는 A의 약수가 아니다");
		}
		
		in.close();
	}
}
