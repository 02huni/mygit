package car;

public class SonataHighGrade extends Sonata {
	
	public SonataHighGrade(String color,String tire,int displacement,String handle,int tax) {
		super("레드","광폭타이어", 2500, "파워핸들",tax);
		if(displacement>2000) {
			tax=1500;
		}
	}
	
}
