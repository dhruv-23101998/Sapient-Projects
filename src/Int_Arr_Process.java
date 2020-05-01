import java.util.*;
public class Int_Arr_Process {
	int n,a[];
	Int_Arr_Process() {
		n=10;
		a=new int[n];
	}
	Int_Arr_Process(int number) {
		n=number;
		a=new int[n];
	}
	Int_Arr_Process(Int_Arr_Process x) {
		n=x.n;
		a=x.a;
	}
	void read() {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
	}
	void display() {
		System.out.println("Displaying Horizontly");
		for(int i=0;i<n;i++) {
			System.out.printf("%d ",a[i]);
		}
		System.out.println();
		System.out.println("Displaying Vertically");
		for(int i=0;i<n;i++) {
			System.out.printf("%d",a[i]).println();
		}
	}
	void sort() {
		Arrays.sort(a);
	}
	void findBiggestSmallest() {
		int mx=a[0],mn=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>mx) mx=a[i];
			if(a[i]<mn) mn=a[i];
		}
		System.out.printf("Biggest Element is %d", mx).println();
		System.out.printf("Smallest Element is %d", mn).println();
	}
	void findsum() {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		System.out.printf("Sum is %d", sum).println();
	}
	void find2ndBiggest() {
		int[] b=new int[n];
		for(int i=0;i<n;i++) b[i]=a[i];
		Arrays.sort(b);
		int i,ans=b[n-1];
		for(i=n-2;i>=0;i--)
			if(b[i]!=ans) {
				ans=b[i];
				break;
			}
		if(i==-1) {
			System.out.println("2nd Biggest Element not present");
		}
		else {
			System.out.printf("2nd Biggest Element %d", ans).println();
		}
	}
}