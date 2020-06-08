public class Print {
	boolean flag=true;
	synchronized void printTic() {
		while(flag==false) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
		System.out.print("Tic ");
		flag=false;
		notifyAll();
	  }
	  synchronized void printToc() {
		  while(flag==true) {
			  try {
				  wait();
			  }
			  catch (InterruptedException e) { 
				  e.printStackTrace();
			  }
		  }
		  System.out.println("Toc");
		  flag=true;
		  notifyAll();
	  }
}