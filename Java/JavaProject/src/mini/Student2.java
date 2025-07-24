package mini;

public class Student2 extends LunchMenu {
	public Student2(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
	}
	public int total() {
		int stu2= rice + bulgogi+milk+almond;
		return stu2;
	}
}
