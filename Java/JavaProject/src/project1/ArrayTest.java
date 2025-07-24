package project1;
import project1.ArrMember;
public class ArrayTest {

	public static void main(String[] args) {
		ArrMember[] members=new ArrMember[5];
		
		members[0]=new ArrMember(1,"aaa","임영웅");
		members[1]=new ArrMember(2,"bbb","영탁");
		members[2]=new ArrMember(3,"ccc","손흥민");
		members[3]=new ArrMember(4,"ddd","박지성");
		members[4]=new ArrMember(5,"eee","차두리");
		
		for(int i=0;i<members.length;i++) {
			System.out.printf("%d번 회원의 아이디는 %s이고, 이름은 %s입니다.\n",
					members[i].memberNo,members[i].memberId,members[i].memberName);
		}
	}

}
