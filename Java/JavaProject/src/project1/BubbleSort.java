package project1;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int n = 8;
		int temp = 0;
		int tempidx = 0;
	
		for (int i = 0; i < n; i++) {
			tempidx = i;
			temp = a[i];
			
			for (int j = i; j < n-i-1; j++) {
				// 인접한 두원소 비교해서 자리바꾸기
				if (a[j] > a[j+1]) {
					tempidx=j+1;
					temp=a[j];
					a[j]=a[tempidx];
					a[j+1]=temp;
					for (int k = 0; k < n; k++) {
						System.out.print(a[k] + "\t");	
					}
					System.out.println( "");
				}
				
			}
			
		
			
			System.out.println("");

		}
	
	}
}
