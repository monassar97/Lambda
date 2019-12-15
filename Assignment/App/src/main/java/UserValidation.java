import java.util.List;

public class UserValidation implements Validation{
	UserRepo repo=new UserRepo();
	List<User> users=repo.getUsers();
	
	public boolean LogIn(String userName, String password) {
		if(isUserExist(userName,password))
			return true;
		return false;
	}
	public User returnIfExist(String userName, String password) {
		for(int i=0;i<users.size();i++) {
			if(userName.equals(users.get(i).getUsername())) {
				if(users.get(i).getPassword().equals(password)) {
					return users.get(i);
				}
			}
		}
		return null;
	}
	
	public boolean isUserExist(String userName,String password) {
		for(int i=0;i<users.size();i++) {
			if(userName.equals(users.get(i).getUsername())) {
				if(users.get(i).getPassword().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}

}
