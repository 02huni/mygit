package project1;
import project1.Student;
public class StudentScoreReport {

	public static void main(String[] args) {
		Student[] stu=new Student[10];
		
		stu[0]=new Student("장훈희",100,80,70);
		stu[1]=new Student("장준희",60,50,90);
		stu[2]=new Student("하상현",80,90,60);
		stu[3]=new Student("김지함",100,80,70);
		stu[4]=new Student("신재인",100,80,70);
		stu[5]=new Student("이예나",100,80,70);
		stu[6]=new Student("여정민",100,80,70);
		stu[7]=new Student("김지희",100,80,70);
		stu[8]=new Student("이성현",100,80,70);
		stu[9]=new Student("김태수",100,80,70);
		
		System.out.print("### Score Report###\n");
		System.out.println("이름\t국어\t영어\t수학\t|총합\t평균\n------------------------------------");
		for(int i=0;i<stu.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d \t| %d\t%s\n",
					stu[i].getStudentName(),stu[i].getScoreKor(),stu[i].getScoreEng(),stu[i].getScoreMath(),stu[i].getSum(),stu[i].getEvg());
		}
	}

}
