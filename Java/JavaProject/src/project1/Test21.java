package project1;
import java.util.Scanner;

public class Test21 {

	public int avr(int eng,int math) {
		return eng+math/2;
	}
	public static void main(String[] args) {
		int[][] scores= new int[3][2];
		Scanner in = new Scanner(System.in);
		System.out.println("3명의 영어, 수학 점수를 입력하세요.");
	    for(int i=0;i<3;i++){//행
	    	System.out.println(i+1+"번 영어:");
	    	scores[i][0]=in.nextInt();
	    	System.out.println("수학:");
	    	scores[i][1]=in.nextInt();
	    }
	    System.out.print("NO. 영어 수학 평균\n");
	    for(int i=0;i<3;i++){
	    	System.out.print(i+1+scores[i][0]+scores[i][1]+"\n");
	    }
	 
		in.close();
	}

}
