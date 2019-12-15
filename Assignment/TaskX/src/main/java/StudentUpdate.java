import java.util.HashMap;

public class StudentUpdate implements Command{
	RepoCUD repo1=new RepoCUD();
	
	public void execute(HashMap<String, String> mp) {
		repo1.updateStudent(Integer.parseInt(mp.get("id")),mp.get("name"));
	}


}
