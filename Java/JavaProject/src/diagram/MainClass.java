package diagram;

public class MainClass {

	public static void main(String[] args) {
		Student student=new Student("홍길동");
		Course course=new Course("Software Engineering");
		Transcript transcript=new Transcript(student, course);
		student.addTranscript(transcript);
		transcript.setGrade("A+");
		transcript.setData("2022년");

		Student student1=new Student("홍길서");
		Course course1=new Course("Design Pattern");
		Transcript transcript1=new Transcript(student1, course1);
		student.addTranscript(transcript1);
		transcript1.setGrade("C+");
		transcript1.setData("2022년");
		
		Student student2=new Student("홍길남");
		Transcript transcript2=new Transcript(student2, course1);
		student.addTranscript(transcript2);
		transcript2.setGrade("A+");
		transcript2.setData("2022년");

		System.out.println(course+"\n"+ course1);
		System.out.println(student+"\n"+ student1+"\n"+student2);
		System.out.println(student.getTranscripts());
	}
}
