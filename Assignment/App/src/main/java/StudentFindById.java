import java.util.HashMap;
import java.util.List;

public class StudentFindById implements ServiceInterface{
	RepoImplementation repo=new RepoImplementation();

	public void execute(final HashMap<String, Object> map) {
		
		Thread t=new Thread(new Runnable() {
			
			public void run() {
				Student student=repo.getStudent(Integer.valueOf((String) map.get("id")));
				System.out.println(student.toString());
			}
		});
		t.start();
		
		
	}
}
