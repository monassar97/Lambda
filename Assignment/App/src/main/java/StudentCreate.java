import java.util.HashMap;
import java.util.List;

public class StudentCreate implements ServiceInterface{
	
	RepoImplementation repo=new RepoImplementation();
	IdGeneratorImplementation generatorImplementation=new IdGeneratorImplementation();
	
	public void execute(final HashMap<String, Object> map) {
		Thread t=new Thread(new Runnable() {
			public void run() {
				List<Courses> courses = (List<Courses>)map.get("courses");
				Student student=new Student(generatorImplementation.generateId(),(String) map.get("name"), courses);
				repo.createStudent(student);
			}
		});
		t.start();
	}
}