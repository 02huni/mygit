package project1;

public class MainClass {
	

	public static void main(String[] args) {
		Hqstore[] st=new Hqstore[3];
		st[0]=new Store1();
		st[1]=new Store2();
		st[2]=new Store3();
		for(int i=0; i<st.length;i++) {
			System.out.print(i+1+"호점 가격표입니다.\n");
			st[i].jajangmyeon();
			st[i].jjambbong();
			st[i].tangsu();
			st[i].mandu();
			st[i].bab();
			System.out.print("=================\n");
		}
	}

}
