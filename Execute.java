import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Execute {
	public static void main(String[] Args) throws IOException {
		int n=Args.length;
		if (n>0) {
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=Integer.parseInt(Args[i]);
			}
			Command_Line1 x=new Command_Line1();
			x.setData(arr);
			x.displayData();
		}
		else {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			String line=reader.readLine();
			n=Integer.parseInt(line);
			KeyRead_Line2 x=new KeyRead_Line2();
			x.read(n);
			x.display();
			x.sort();
			int y=Integer.parseInt(reader.readLine());
			x.find(y);
		}
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(reader.readLine());
		Convert convert=new Convert();
		System.out.println(convert.fig_to_words(n));
	}
}