import java.util.HashMap;
import java.util.List;

public class StudentGetAll implements ServiceInterface{
	RepoImplementation repo=new RepoImplementation();

	public void execute(HashMap<String, Object> map) {
		
		Thread t=new Thread(new Runnable() {
			
			public void run() {
				List<Student> students=repo.getAllStudents();
				for(int i=0;i<students.size();i++) {
					System.out.println(students.get(i).getName());
				}
			}
		});
		t.start();
	}
	
}
