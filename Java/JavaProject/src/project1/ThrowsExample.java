package project1;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지않습니다.");
		}
	}

	public static void findClass() throws ClassNotFoundException{
		Class clazz=Class.forName("java.lang.String2");
	}
}
