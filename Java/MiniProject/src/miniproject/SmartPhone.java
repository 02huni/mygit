package miniproject;
import miniproject.Addr;
import java.util.Scanner;

public class SmartPhone {
   Scanner in = new Scanner(System.in);
   Addr adarr[]=new Addr[10];
   int count=0;
   
   public void printContact() {
	   ShowData sd=new Addr("장훈희","010-8376-8763","hhheartyy@gmail.com","하남","가족");
	   sd.showData();
   }
   
   public void inputAddrData() {
      System.out.print("\n이름:");
      String name = in.nextLine();
      System.out.print("전화번호:");
      String phoneNo = in.nextLine();
      System.out.print("이메일:");
      String email = in.nextLine();
      System.out.print("주소:");
      String addr = in.nextLine();
      System.out.print("그룹:");
      String group = in.nextLine();
      Addr ad=new Addr(name, phoneNo, email, addr, group);
      addAddr(ad);
   }

   public void addAddr(Addr ad) {
      if(count<adarr.length){
         adarr[count++]=ad;
      }
   }
   
   public void printAllAddr() {
      for(int i=0; i<count;i++) {
      adarr[i].printInfo();
      }
   }
   
   public void searchAddr(String name) {
	  boolean found = false;
      for(int i=0; i<count;i++) {
         if(adarr != null &&adarr[i].getName().equals(name)) {
         adarr[i].printInfo();
         found = true;
         }
      }
     if (!found) {
         System.out.println("해당 이름의 연락처가 없습니다.");
     }
      
   }
   
   public void deleteAddr(String name) {
      for (int i = 0; i < count; i++) {
            if (adarr != null &&adarr[i].getName().equals(name)) {
                for (int j = i; j < count - 1; j++) {
                    adarr[j] = adarr[j + 1];
                }
                adarr[--count] = null;
                System.out.println("삭제되었습니다.");
                return;
            }
        }
        System.out.println("삭제할 이름이 없습니다.");
   }

   
   public void editAddr(String name, Addr newAddr){
      for (int i = 0; i < count; i++) {
            if (adarr[i].getName().equals(name)) {
                adarr[i] = newAddr;
                System.out.println("수정되었습니다.");
            }
        }
        System.out.println("수정할 이름이 없습니다.");
    }
}
