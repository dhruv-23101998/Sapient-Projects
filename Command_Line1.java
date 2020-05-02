public class Command_Line1 {
	int n,sum,mx,mn;
	double avg;
	void calData(int[] Args) {
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=Args[i];
		}
		sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		avg=(double)sum/n;
		mx=a[0];
		mn=a[0];
		for(int i=1;i<n;i++) {
			mx=Math.max(mx,a[i]);
			mn=Math.min(mn, a[i]);
		}
	}
	void setData(int[] Args) {
		n=Args.length;
		calData(Args);
	}
	void displayData() {
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(mx);
		System.out.println(mn);
	}
}