package project1;

public class Student {
	private String studentName;
	private int scoreKor;
	private int scoreEng;
	private int scoreMath;
	
	public Student(String studentName,int scoreKor, int scoreEng,int scoreMath) {
		this.studentName=studentName;
		this.scoreKor=scoreKor;
		this.scoreEng=scoreEng;
		this.scoreMath=scoreMath;
	}
	
	public int getSum() {
		return scoreKor+scoreEng+scoreMath;
	}
	public double getEvg() {
		return getSum()/3.0;
	}
	public String getStudentName(){
		return studentName;
	}
	public void setStudentName(String stdentName){
		this.studentName=studentName;
	}
	
	public int getScoreKor(){
		return scoreKor;
	}
	public void setScoreKor(int scoreKor) {
		this.scoreKor=scoreKor;
	}
	
	public int getScoreEng(){
		return scoreEng;
	}
	public void setScoreEng(int scoreEng){
		this.scoreEng=scoreEng;
	}
	
	public int getScoreMath(){
		return scoreMath;
	}
	public void setScoreMath(int scoreMath){
		this.scoreMath=scoreMath;
	}
}
