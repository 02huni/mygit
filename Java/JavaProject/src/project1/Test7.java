package project1;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수값: ");
		int num = in.nextInt();
		if (num<0) {
			num= -num;
		};
		System.out.println("절대값은 :"+num+ "입니다.");
		in.close();

	}

}
