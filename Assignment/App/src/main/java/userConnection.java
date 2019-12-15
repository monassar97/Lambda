import java.util.List;

public class userConnection {
	private UserValidation valid=new UserValidation();
	public void check(String userName,String password) {
		if(valid.LogIn(userName, password)) {
			//user.getConnection().getRepo();
			Student student=new Student();
			student.setName("ahmad");
			student.setCourses(null);
			System.out.println("Valid");
			User user=valid.returnIfExist(userName, password);			
		}else {
			System.out.println("No");
		}

	}
}
