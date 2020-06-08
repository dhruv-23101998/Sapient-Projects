import java.util.*;
import java.io.*;
public class Execute {
	static int n;
	static List<Student> students=new ArrayList<Student> ();
	static Student readStudent() throws IOException {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id=in.nextInt();
		String name = br.readLine();
		String city = br.readLine();
		return new Student(id,name,city);
	}
	static void displayStudent(Student student) {
		System.out.printf("Student ID = %d, Student Name = %s, Student City= %s",student.getId(),student.getName(),student.getCity()).println();
	}
	static void displayStudentParticularCity(String city) {
		for(int i=0;i<n;i++) {
			if(students.get(i).getCity().equals(city))
				System.out.println(students.get(i).getName());
		}
	}
	static void displayStudentSortedNamewise() {
		List<Student> loc=new ArrayList<Student> ();
		for(int i=0;i<n;i++) {
			loc.add(students.get(i));
		}
		Collections.sort(loc,new CompareStudentNamewise());
		for(int i=0;i<n;i++)
			displayStudent(loc.get(i));
	}
	static void displayStudentSortedCitywise() {
		List<Student> loc=new ArrayList<Student> ();
		for(int i=0;i<n;i++) {
			loc.add(students.get(i));
		}
		Collections.sort(loc,new CompareStudentCitywise());
		for(int i=0;i<n;i++)
			displayStudent(loc.get(i));
	}
	static void displayStudentWithId(int id) throws StudentNotFoundException {
		boolean ans=false;
		for(int i=0;i<n;i++) {
			Student stud=students.get(i);
			if(stud.getId()==id) {
				ans=true;
				displayStudent(stud);
			}
		}
		if(ans==false)
			throw new StudentNotFoundException("No Student With Given ID");
	}
	public static void main(String[] Args) throws StudentNotFoundException, IOException {
		n=5;
		for(int i=0;i<n;i++) {
			students.add(readStudent());
		}
		for(int i=0;i<n;i++) {
			displayStudent(students.get(i));
		}
		displayStudentParticularCity("Bombay");
		displayStudentSortedNamewise();
		displayStudentSortedCitywise();
		displayStudentWithId(19);
	}
}