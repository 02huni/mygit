package project1;
import java.util.Scanner;
public class Member {
	static void checkVaccin(int birthyear, int currentyear) {
		//년도 입력받아 나이로 환산
		int age=currentyear-birthyear;
		if(age<13||age>=60) {
			System.out.println("무료예방접종이 가능합니다.");
		}
		else {
			System.out.println("무료예방접종 대상이 아닙니다.");
		}
	}
	static void healthCheck(int birthyear,int currentyear) {
		int age=currentyear-birthyear;
		if(currentyear%2==1) {
			if(age%2==1&&age>=20) {
			System.out.println("건강검진을 받을수있는년도입니다.");
			}
		}
		else if(currentyear%2==0) {
			if(age%2==0&&age>=20) {
			System.out.println("건강검진을 받을수있는년도입니다.");
			}
		}
		else {
			System.out.println("건강검진 대상자가 아닙니다.");
		}
		if(age>=40) {
			System.out.println("무료로 암검사가 가능합니다.");
		}	
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("태어난 해(연도)를 입력해주세요.:");
		int birthyear = in.nextInt();
		System.out.println("올해년도를 입력해주세요");
		int currentyear = in.nextInt();
		Member.checkVaccin(birthyear,currentyear);
		Member.healthCheck(birthyear,currentyear);
	}
}
