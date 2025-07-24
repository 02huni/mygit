package miniproject;

public class CompanyAddr extends SmartPhone{
	String companyname;
	String department;
	String rank;
	
	public void inputAddrData() {
	super.inputAddrData();
	System.out.print("회사이름:");
	companyname=in.nextLine();
	System.out.print("부서이름:");
	department=in.nextLine();
	System.out.print("직급:");
	rank=in.nextLine();
	
	}
}
