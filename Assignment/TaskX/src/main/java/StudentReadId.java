import java.util.HashMap;

public class StudentReadId  implements Command{
	RepoR repo2=new RepoR();
	public void execute(HashMap<String, String> mp) {
		printstudent(repo2.findStudentById(Integer.parseInt(mp.get("id"))));
		
	}
	public static void printstudent(Student student) {
		System.out.println("Student ID : "+student.getId()+" Student Name : "+student.getName());
	}

}
