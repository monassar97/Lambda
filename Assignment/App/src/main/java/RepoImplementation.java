import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RepoImplementation implements Repo{
	private static Map<Integer, Student> students=new HashMap<Integer, Student>();

	public void createStudent(Student student) {
		students.put(student.getId(),student);
	}

	public Student getStudent(int id) {
		return students.get(id);
	}

	public void deleteStudentById(int id) {
		students.remove(id);
	}

	public void updateStudent(Student student) {
		students.put(student.getId(), student);
	}

	public List<Student> getAllStudents() {
		List<Student> list=new LinkedList<Student>();
		for(int id:students.keySet()) {
			list.add(students.get(id));
		}
		return list;
	}
}