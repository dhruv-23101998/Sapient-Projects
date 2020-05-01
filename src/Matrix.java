import java.util.*;
public class Matrix {
	int n,m,a[][];
	Matrix() {
		n=3;
		m=3;
		a=new int[n][m];
	}
	Matrix(int c,int d) {
		n=c;
		m=d;
		a=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=0;
	}
	Matrix(Matrix mat) {
		n=mat.n;
		m=mat.m;
		a=mat.a;
	}
	void read() {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=in.nextInt();
	}
	void display() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				System.out.printf("%d ", a[i][j]);
			System.out.println();
		}
	}
	Matrix add (Matrix mat) {
		if(n!=mat.n || m!=mat.m) {
			System.out.println("Addtion Not Possible as dimensions are not same");
			return mat;
		}
		Matrix loc=new Matrix(mat);
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				loc.a[i][j]+=a[i][j];
		return loc;
	}
	void checkScalar() {
		boolean ans=true;
		if(n!=m) ans=false;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				if(i!=j && a[i][j]!=0) {
					ans=false;
					break;
				}
		for(int i=1;i<n;i++)
			if(a[i][i]!=a[i-1][i-1]) {
				ans=false;
				break;
			}
		if(ans) System.out.println("Scalar Matrix");
		else System.out.println("Non Scalar Matrix");
	}
	Matrix multiply(Matrix mat) {
		if(m!=mat.n) {
			System.out.println("Matrix multiplication not possible");
			return mat;
		}
		Matrix loc=new Matrix(n,mat.m);
		for(int i=0;i<n;i++)
			for(int j=0;j<mat.m;j++)
				for(int k=0;k<m;k++)
					loc.a[i][j]+=a[i][k]*mat.a[k][j];
		return loc;
	}
}