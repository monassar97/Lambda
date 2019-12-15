import java.util.HashMap;

public class RepoCUD implements StudentsDAO{
	
	Student student;
	private HashMap<Long, String> map=Student.map;
	Countergenerator generator=new Countergenerator();
	
	
	public void CreateStudent(String name) {
		long count=generator.getCount();
		map.put(count,name);

		student=new Student(count,name);
	}

	public void deleteStudent(Student student) {
		map.remove(student.getId());
	}
	public void deleteStudentById(long id) {
		if(map.containsKey(id)) {

		map.remove(id);
		}
		else {
			System.out.println("Student Does not Exist !");
		}
	}

	public void updateStudent(long id,String newName) {
		if(map.containsKey(id)) {
			map.put(id, newName);
		}
		else 
			System.out.println("Student Does not Exist !");
	}

	
	
}
