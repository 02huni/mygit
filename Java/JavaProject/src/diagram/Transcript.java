package diagram;

public class Transcript {
	private Student student;
	private Course course;
	private String data;
	private String grade;
	
	public Transcript(Student student, Course course) {
		this.student=student;
		this.course=course;
	}
	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return course;
	}
	public void setData(String data) {
		this.data=data;
	}
	public String getData() {
		return data;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public String getGrade() {
		return grade;
	}
	
	public String toString() {
		return student+"은(는) "+data+"에 개설한 "+course+"에서 "+grade+"를 받았다.\n";
	}
}
