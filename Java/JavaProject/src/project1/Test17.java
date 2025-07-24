package project1;

import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("2이상의 정수값 :");
		int a = in.nextInt();

		for(int i=a-1;i<2;i--){
			if(a%i==0) {
				System.out.println("소수가 아닙니다");
			}
			System.out.println("소수입니다.");
		}
		in.close();
	}
}
