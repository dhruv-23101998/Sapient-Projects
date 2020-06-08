import java.io.File;
public class PrintAllFiles {
	static void RecursivePrint(File[] file,int index,int level) {
		if(index==file.length)
			return;
		for(int i=0;i<level;i++)
			System.out.print("\t");
		if(file[index].isFile())
			System.out.println(file[index].getName());
		else if(file[index].isDirectory()) {
			System.out.println("["+file[index].getName() +"]");
			RecursivePrint(file[index].listFiles(),0,level+1);
		}
		RecursivePrint(file,++index,level);
	}
	public static void main(String[] args) {
		String path = "C:\\Users\\Dhruv Agarwal\\Downloads";
		File file = new File(path);
		if (file.exists() && file.isDirectory()) {
			File files[]=file.listFiles();
			System.out.println("Files from: "+file);
			RecursivePrint(files,0,0);
		}
	}
}