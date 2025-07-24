package project1;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x값: ");
		float x = in.nextFloat();
		System.out.print("y값: ");
		float y = in.nextFloat();
		float sum = x+y;
		float avr = (x+y)/2;
		System.out.println("합계는" +sum+"입니다." );
		System.out.println("평균은"+avr+ "입니다." );
		in.close();
	}
}
