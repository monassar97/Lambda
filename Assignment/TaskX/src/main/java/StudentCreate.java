import java.util.HashMap;

public class StudentCreate implements Command{
	
	RepoCUD repo1=new RepoCUD();
	
	public void execute(HashMap<String, String> mp) {
		repo1.CreateStudent(mp.get("name"));
	}
}
