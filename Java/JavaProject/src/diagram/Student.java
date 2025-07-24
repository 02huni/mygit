package diagram;

import java.util.Vector;

public class Student {
	private String name;
	private Vector<Transcript> transcripts;
	
	public Student(String name) {
		this.name=name;
		transcripts = new Vector<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);	
	}
	public Vector<Transcript> getTranscripts(){
		return transcripts;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name;
	}
	
}
