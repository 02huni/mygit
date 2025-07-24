package project1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = in.nextLine();
		System.out.print("나이를 입력하세요: ");
		int age = in.nextInt();
		System.out.println(name+"님 안녕하세요!"+age+"살 이네요!");
		in.close();
	}
}
