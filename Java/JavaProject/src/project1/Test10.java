package project1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 a: ");
		int a = in.nextInt();
		System.out.print("정수 b: ");
		int b = in.nextInt();
		
		if(a>b) {
			System.out.println(a+">="+b+ "가 되도록 정렬했습니다.");
			System.out.println("변수 a는"+a+"입니다");
			System.out.println("변수 b는"+b+"입니다");
		}
		else {
			System.out.println(b+">="+a+ "가 되도록 정렬했습니다.");
			System.out.println("변수 b는"+b+"입니다");
			System.out.println("변수 a는"+a+"입니다");
		}
		
		in.close();
	}
}
