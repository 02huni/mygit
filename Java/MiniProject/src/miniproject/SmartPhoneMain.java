package miniproject;
import miniproject.SmartPhone;
import miniproject.Addr;
import java.util.Scanner;
public class SmartPhoneMain {

   public static void main(String[] args) {
      SmartPhone sm=new SmartPhone();
      Scanner in = new Scanner(System.in);
      int menu;
      
      CompanyAddr co=new CompanyAddr();
      CustomerAddr cu=new CustomerAddr();
      sm.printContact();
      System.out.print("# 데이터 2개를 입력합니다.");
      for(int i=0; i<2;i++) {
   	   sm.inputAddrData();
   	   System.out.print("데이터 저장완료\n");
      }
       while (true) {
           printMenu();
           menu =  in.nextInt();
           switch (menu) {
               case 1:
                   co.inputAddrData();
                   break;
                   
               case 2:
            	   cu.inputAddrData();
                   break;
                   
               case 3:
            	   sm.printAllAddr();
                   break;
                   
               case 4:
            	   System.out.print("검색할 이름: ");
                   in.nextLine();
                   sm.searchAddr(in.nextLine());
                   break;
                   
               case 5:
            	   System.out.print("삭제할 이름: ");
                   in.nextLine();
                   sm.deleteAddr(in.nextLine());
                   break;
                   
               case 6:
            	   System.out.print("수정할 이름: ");
                   in.nextLine();
                   System.out.println("새 연락처 정보를 입력하세요:");
                   String name = in.nextLine();
                   sm.editAddr(name, new Addr(
                       in.nextLine(), // 이름
                       in.nextLine(), // 전화번호
                       in.nextLine(), // 이메일
                       in.nextLine(), // 주소
                       in.nextLine()  // 그룹
                   ));
                   break;  
               case 7:
            	   System.out.println("프로그램을 종료합니다.");
                   System.exit(0);
                   break;
               default:
                   System.out.println("잘못된 선택입니다.");
               }
           }
       }
   public static void printMenu() {
        System.out.println("주소관리 메뉴---------");
        System.out.println("1. 연락처 등록(회사)");
        System.out.println("2. 연락처 등록(거래처)");
        System.out.println("3. 모든 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 연락처 삭제");
        System.out.println("6. 연락처 수정");
        System.out.println("7. 프로그램 종료");
        System.out.println("--------------------- ");
    }
}
