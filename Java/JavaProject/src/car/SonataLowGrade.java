package car;

public class SonataLowGrade extends Sonata {
	public SonataLowGrade(String color,String tire,int displacement,String handle,int tax) {
		super("블루","일반타이어", 2000,"파워핸들",tax);
		if(displacement<=2000) {
			tax=1000;
		}
	}
}
