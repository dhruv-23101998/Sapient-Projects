public class Execute {
	public static void main(String[] args) {
	    Print print = new Print();
	    Thread t1 = new Thread(new MyThread(20,print,true));
	    Thread t2 = new Thread(new MyThread(20,print,false));
	    t1.start();
	    t2.start();
	  }
}