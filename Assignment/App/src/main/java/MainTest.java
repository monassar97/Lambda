import java.util.HashMap;
import java.util.Map;

public class MainTest {
	public static void main(String[] args) {
		UserRepo repo=new UserRepo();
		User user=new User(0,"ahmad","123");
		repo.CreateUser(user);
		User user2=new User(1,"emad","asd");
		repo.CreateUser(user2);
		userConnection con=new userConnection();
		con.check("emad","asd");	
		User userX=new User(new ConnectionPool(),new StudentCreate(),new StudentGetAll());
		HashMap<String,Object> map= new HashMap<String, Object>();
		map.put("name","emad");
		map.put("courses",null);
		userX.create.execute(map);
		userX.getAll.execute(map);
	}
}
