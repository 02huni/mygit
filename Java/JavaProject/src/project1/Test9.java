package project1;

import java.util.Scanner;
public class Test9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 a: ");
		int a = in.nextInt();
		System.out.print("정수 b: ");
		int b = in.nextInt();
		String result=(a-b>=10||b-a >= 10)?"두 값의 차이는 10 이상입니다 ":"두 값의 차이는 9이하입니다 ";
		System.out.print(result);
		in.close();
	}
}
