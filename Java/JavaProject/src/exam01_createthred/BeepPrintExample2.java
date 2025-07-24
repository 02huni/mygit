package exam01_createthred;
import java.awt.Toolkit;
public class BeepPrintExample2 {
	public static void main(String[] args) {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Thread thread=new Thread() {
			public void BeepThread() {
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}	
				}
			}
		};
		thread.start();
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
