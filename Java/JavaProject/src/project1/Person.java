package project1;

public class Person {
		String name;
		String phonenum;
		String speci;
		int grade;
		String email;
		String birth;
		String adress;
	public Person(){
		name="SHKIM";
		phonenum="010-9999-7777";
		speci="컴퓨터";
		grade=2;
		email="shkim@gmail.com";
		birth="2000-10-11";
		adress="서울";
		this.infoprint();
	}
	public Person(int i){
		name="JJKIM";
		phonenum="010-1111-3333";
		speci="컴퓨터";
		grade=2;
		email="jjkim@gmail.com";
		birth="정보없음";
		adress="정보없음";
		this.infoprint();
	}
	void infoprint() {
		System.out.print(" 이름"+name+"\n 전화번호:"+phonenum+"\n 전공:"+speci+"\n 학년 :"+grade+"\n 이메일 :"+email+"\n 생일 :"+birth+"\n 주소:"+adress);
	}
	
	public static void main(String[] args) {
		Person ps=new Person();
		System.out.println("\n------------------------------------------");
		Person ps2=new Person(1);
	
		
	}
}
