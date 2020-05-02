import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class KeyRead_Line2 {
	int n;
	ArrayList<Integer> a=new ArrayList<Integer>();
	void read(int number) throws IOException {
		n=number;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String line=reader.readLine();
		String[] strs = line.trim().split("\\s+");
		for(int i=0;i<n;i++) {
			a.add(Integer.parseInt(strs[i]));
		}
	}
	void display() {
		for(int i=0;i<n;i++) {
			System.out.printf("%d ",a.get(i));
		}
		System.out.println();
	}
	void sort() {
		Collections.sort(a);
		System.out.println(a);
	}
	void find(int x) {
		for(int i=0;i<n;i++) {
			if(a.get(i)==x) {
				System.out.printf("Position of %d is %d\n", x,i+1);
				return;
			}
		}
		System.out.println("No Such Number Present");
	}
}