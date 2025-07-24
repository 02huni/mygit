package miniproject;

public class Addr implements ShowData{
   private String name;
   private String phoneNo;
   private String email;
   private String addr;
   private String group;
   
   public void showData() {
	   System.out.println("이름: 장훈희\n전화번호:010-8376-8763");
   }
   public Addr(String name, String phoneNo, String email, String addr, String group) {
      this.name=name;
      this.phoneNo=phoneNo;
      this.email=email;
      this.addr=addr;
      this.group=group;
   }
   public String getName(){
      return name;
   }
   public void setName(String name){
      this.name=name;
   }
   public String getPhoneNo(){
      return phoneNo;
   }
   public void setPhoneNo(String phoneNo){
      this.phoneNo=phoneNo;
   }
   public String getEmail(){
      return email;
   }
   public void setEmail(String email){
      this.email=email;
   }
   public String getAddr(){
      return addr;
   }
   public void setAddr(String addr){
      this.addr=addr;
   }
   public String getGroup(){
      return group;
   }
   public void setGroup(String group){
      this.group=group;
   }
  
   public void printInfo() {
      System.out.printf("\n이름:"+name+"\n전화번호:"+ phoneNo+"\n이메일:"+ email+"\n주소:"+addr+"\n그룹(가족/친구):"+group);
      System.out.print("\n--------------------------------\n");
   }
}

