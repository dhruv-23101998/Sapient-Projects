public class MyThread implements Runnable {
	int num;
	boolean flag;
	Print print;
	public MyThread(int num,Print print, boolean flag) {
		this.num=num;
		this.flag=flag;
		this.print=print;
	}
	@Override
	public void run() {
		 int number=flag==false ? 2 : 1;
		    while(number<=num) {
		      if (flag) {
		        print.printTic();
		      }
		      else {
		        print.printToc();
		      }
		      number=number+2;
		    }
	}
}