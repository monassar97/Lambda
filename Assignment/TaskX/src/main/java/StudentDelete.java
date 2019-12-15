import java.util.HashMap;

public class StudentDelete implements Command{

	RepoCUD repo1=new RepoCUD();
	
	public void execute(HashMap<String, String> mp) {
		repo1.deleteStudentById(Integer.parseInt(mp.get("id")));
	}

}
