package project1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수값: ");
		int num = in.nextInt();
		int sum = num+100;
		int sub = num-100;
		System.out.println("100을 더한 값은 %d 입니다." +sum);
		System.out.println("100을  뺀 값은 %d 입니다." +sub);
		in.close();
	}
}
