public class Convert {
	public String fig_to_words(int number) {
		String str=Integer.toString(number);
		int len=str.length();
		char num[]=str.toCharArray();
		if(len>4) {
			String s="Length greater than 4 is not supported";
			return s;
		}
		String singledigits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
		String twodigits[]={"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String tenmultiples[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String tenpowers[]={"hundred","thousand"};
		String s="";
		if(len==1) {
			s=singledigits[number];
		}
		int x = 0;
	    while(x<num.length) { 
	        if(len >= 3) { 
	            if(num[x]-'0' != 0) { 
	            	s=s+singledigits[num[x] - '0']+" "+tenpowers[len - 3]+" "; 
	            } 
	            --len; 
	        }
	        else { 
	            if(num[x]-'0'==1) { 
	                int sum=num[x]-'0'+num[x+1]-'0';
	                s=s+twodigits[sum]+" only";
	                System.out.println(s);
	                return s; 
	            } 
	            else if(num[x]-'0'==2 && num[x+1]-'0'==0) {
	            	s="twenty only";
	                return s; 
	            }
	            else { 
	                int i=(num[x]-'0'); 
	                if(i>0) 
	                s=s+tenmultiples[i]+" ";
	                else
	                s=s+"";
	                ++x; 
	                if(num[x]-'0'!=0) 
	                    s=s+singledigits[num[x] - '0']; 
	            } 
	        } 
	        ++x; 
	    }
	    s+=" only";
	    return s;
	}
}