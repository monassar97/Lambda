import java.util.ArrayList;
import java.util.Map;

public class RepoR implements ServiceInterface{
	
	Student student;
	private Map<Long, String> map=Student.map;
	
	public Student findStudentById(long id) {
		if(map.containsKey(id)) {
			student=new Student();
			student.setId(id);
			student.setName(map.get(id));
			return student;
		}
		return null;
	}

	public ArrayList<Student> findAllStudents() {
		ArrayList<Long> list = new ArrayList<Long>(map.keySet());
		ArrayList<Student>studentList=new ArrayList<Student>();
		for(int i=0;i<list.size();i++) {
			student=new Student();
			long idx=((list.get(i)));
			student.setId(idx);
			student.setName(map.get(list.get(i)));
			studentList.add(student);
		}
		return studentList;
	}
	
}