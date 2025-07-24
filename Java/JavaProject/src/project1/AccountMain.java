package project1;
import project1.Account;
import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("계좌 정보를 입력하세요.");
		System.out.println("계좌명의:");
		String name = in.nextLine();
		System.out.println("계좌번호:");
		int no = in.nextInt();
		System.out.println("잔고:");
		int balance = in.nextInt();
		
		Account ac=new Account(name, no, balance);
		System.out.printf("계좌 기본 정보:{%s, %d, %d}\n",name,no,balance);
		System.out.println("출금액:");
		int out = in.nextInt();
		ac.setBalance(balance,out);
		System.out.printf("잔금은 %d입니다.",ac.getBalance());
	}

}
