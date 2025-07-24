package project1;
import java.util.Scanner;
public class Test19 {

	public static void main(String[] args) {
		int[] person= {};
		int sub=0;
		int avr=0;
		int high=0;
		int low=0;
		int[] score= {};
		
		Scanner in = new Scanner(System.in);
		System.out.print("사람수는 몇명:");
		int people = in.nextInt();
		person=new int[people];
		
		System.out.print("점수를 입력하세요:");
		
		for(int i=0;i==people;i++) {
			System.out.print(person[i]+"번의 점수 :");
			score[i] = in.nextInt();
			sub+=score[i];
			avr= sub/i;
		}
		System.out.print("합계는" +sub +"점입니다.");
		System.out.print("평균은" +avr +"점입니다.");
//		System.out.print("최고점은" + +"점입니다.");
//		System.out.print("최저점은" + +"점입니다.");
		in.close();
	}

}
