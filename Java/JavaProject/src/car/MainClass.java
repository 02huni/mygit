package car;

public class MainClass {
	public static void main(String[] args) {
	Sonata sl=new SonataLowGrade(CarSpecs.color,CarSpecs.tire, CarSpecs.displacement, CarSpecs.handle,CarSpecs.tax);
	Sonata sh=new SonataHighGrade(CarSpecs.color,CarSpecs.tire, CarSpecs.displacement, CarSpecs.handle,CarSpecs.tax);
	System.out.print("********************\n");
	System.out.print("색상:"+sl.color+"\n타이어:"+sl.tire+"\n배기량: "+sl.displacement+"\n핸들: "+sl.handle+"\n세금:"+sl.tax);
	System.out.print("\n********************\n");
	System.out.print("색상:"+sh.color+"\n타이어:"+sh.tire+"\n배기량: "+sh.displacement+"\n핸들: "+sh.handle+"\n세금:"+sh.tax);
	}
}
