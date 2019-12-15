import java.util.HashMap;
import java.util.List;

public class StudentUpdate implements ServiceInterface{
	RepoImplementation repo=new RepoImplementation();
	
	public void execute(HashMap<String, Object> map) {
		List<Courses> courses = (List<Courses>)map.get("courses");
		final Student student=new Student(Integer.valueOf((String) map.get("id")),(String) map.get("name"), courses);
		Thread t=new Thread(new Runnable() {
			
			public void run() {
				repo.updateStudent(student);
				System.out.println(student);
			}
		});
		t.start();
	}

}
