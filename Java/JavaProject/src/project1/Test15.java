package project1;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("양의 정수값: ");
		int x = in.nextInt();
		int result=1;
		for(int i=1;i<=x;i++) {
			result=result*i;
		}
		
		System.out.print("1부터 "+x+"까지의 곱은"+result+"입니다.");
	}

}
