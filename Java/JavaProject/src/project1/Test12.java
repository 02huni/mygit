package project1;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("몇 월인가요? ");
		int month = in.nextInt();
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.print("봄");
			break;
		case 6:case 7:case 8:
			System.out.print("여름");
			break;
		case 9:case 10:case 11:
			System.out.print("가을");
			break;
		case 12:case 1:case 2:
			System.out.print("겨울");
			break;
		default:
			System.out.print("그런 월은 없습니다.");
		}
		
		in.close();
	}

}
