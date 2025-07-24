package diagram;

import java.util.Vector;

public class Course {
	private String name;
	private Vector<Transcript> transcripts;
	
	public Course(String name) {
		this.name=name;
		transcripts=new Vector<Transcript>();
	}
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
}
