import java.util.Comparator;

public class CompareStudentCitywise implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getCity().compareTo(student2.getCity());
	}

}
