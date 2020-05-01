import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Test {
	int operate(int a,int b,Num_Process num) {
		return num.cal(a,b);
	}
	public static void main(String[] Args) throws IOException {
		/* Testing Num_Process */
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String line=reader.readLine();
		String[] strs = line.trim().split("\\s+");
		int a=Integer.parseInt(strs[0]);
		int b=Integer.parseInt(strs[1]);
		String c=strs[2];
		HashMap<String,Num_Process> hash=new HashMap<String,Num_Process>();
		Num_Process add=(int x,int y)->x+y;
		Num_Process sub=(int x,int y)->x-y;
		Num_Process multiply=(int x,int y)->x*y;
		Num_Process divide=(int x,int y)->x/y;
		hash.put("add",add);
		hash.put("sub",sub);
		hash.put("multiply",multiply);
		hash.put("divide",divide);
		Num_Process num=hash.get(c);
		Test tester=new Test();
		System.out.println(tester.operate(a,b,num));
		
		
		/* Testing Int_Arr_Process */
		Int_Arr_Process loc=new Int_Arr_Process(5);
		loc.read();
		loc.display();
		loc.findBiggestSmallest();
		loc.findsum();
		loc.find2ndBiggest();
		loc.sort();
		loc.display();
		Int_Arr_Process locx=new Int_Arr_Process(loc);
		locx.display();
		
		
		/* Testing Matrix */
		Matrix loc1=new Matrix(3,3);
		loc1.read();
		loc1.display();
		loc1.checkScalar();
		Matrix loc2=new Matrix();
		loc2.read();
		loc2.display();
		loc2.checkScalar();
		Matrix loc3=loc1.add(loc2);
		loc3.display();
		Matrix loc4=new Matrix(loc3);
		loc4.display();
		Matrix loc5=loc1.multiply(loc4);
		loc5.display();
	}
}