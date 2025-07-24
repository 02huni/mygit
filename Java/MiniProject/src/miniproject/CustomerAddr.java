package miniproject;

public class CustomerAddr extends SmartPhone{
	String correspondent;
	String item;
	String rank;
	public void inputAddrData() {
	super.inputAddrData();
	System.out.print("거래처이름:");
	correspondent=in.nextLine();
	System.out.print("품목이름:");
	item=in.nextLine();
	System.out.print("직급:");
	rank=in.nextLine();
	
	}
}