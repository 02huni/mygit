package project1;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수값: ");
		int num=in.nextInt();
		int rest=num/10;
		int last= num%10;
		System.out.println("마지막 자릿수를 제외한 값은"+rest +"입니다.");
		System.out.println("마지막 자릿수는 "+last +"입니다" );
		in.close();
	}
}
