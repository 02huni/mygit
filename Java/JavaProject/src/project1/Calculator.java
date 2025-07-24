package project1;
import java.util.Scanner;
public class Calculator {
	static void sum(int numa,int numb) {
		//숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드
		int result=numa+numb;
		System.out.println(result);
	}
	static void sub(int numa,int numb) {
		//숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드
		int result=numa-numb;
		System.out.println(result);
	}
	static void mul(int numa,int numb) {
		//숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드
		int result=numa*numb;
		System.out.println(result);
	}
	static void div(int numa,int numb) {
		//숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드
		int result=numa/numb;
		System.out.println(result);
	}
	static void circle(double radius){
		double circumference=2*Math.PI*radius;
		double circlearea=Math.PI*radius*radius;
		System.out.println("원의둘레:"+circumference+"\t원의 넓이"+circlearea);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수 2개를 입력해주세요:");
		int numa = in.nextInt();
		int numb = in.nextInt();
		Calculator.sum(numa,numb);
		Calculator.sub(numa,numb);
		Calculator.mul(numa,numb);
		Calculator.div(numa,numb);
		System.out.println("원의 반지름을 입력해주세요:");
		double radius = in.nextInt();
		Calculator.circle(radius);
		in.close();
	}
}
