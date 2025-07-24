package mini;

public class MainClass {
	public static void main(String[] args) {
		LunchMenu st1=new Student1(Price.rice,Price.bulgogi, Price.banana,Price.milk,Price.almond);
		LunchMenu st2=new Student1(Price.rice,Price.bulgogi, Price.banana,Price.milk,Price.almond);
		System.out.print("Student1 식비는 " +st1.total()+"원 입니다....\n");
		System.out.print("Student2 식비는 " +st2.total()+"원 입니다....");
	}
}
