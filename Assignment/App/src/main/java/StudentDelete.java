import java.util.HashMap;

public class StudentDelete implements ServiceInterface{
	RepoImplementation repo=new RepoImplementation();
	
	public void execute(final HashMap<String, Object> map) {
		Thread t=new Thread(new Runnable() {
			
			public void run() {
				repo.deleteStudentById(Integer.valueOf((String) map.get("id")));
				System.out.println("Student Deleted");
			}
		});
		t.start();
		
	}

}
