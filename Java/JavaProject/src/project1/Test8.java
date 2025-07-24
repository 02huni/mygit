package project1;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수값: ");
		int a = in.nextInt();
		
		if (a%3==0) {
			System.out.println("이 값은 3으로 나누어집니다 ");
		}
		else if (a%3>0) {
			int b=a%3;
			System.out.println("이 값은 3으로 나눈 나머지는"+ b+"입니다.");
		}
		else {
			System.out.println("양수가 아닌 값을 입력했네요");
		}
		in.close();

	}

}
