package mini;

public class Main {
	
	public static void main(String[] args) {
		IFuction fc;
		fc=new APhone();
		fc.func();
		fc.call();
		fc.speed();
		fc.remote();
		System.out.print("--------------------------\n");
		fc=new BPhone();
		fc.func();
		fc.call();
		fc.speed();
		fc.remote();
		System.out.print("--------------------------\n");
		fc=new CPhone();
		fc.func();
		fc.call();
		fc.speed();
		fc.remote();
		System.out.print("--------------------------\n");
	}

}
