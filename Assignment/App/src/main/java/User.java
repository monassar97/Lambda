
public class User {
	private int id;
	private String username;
	private String password;
	private	ConnectionPool connection;
	StudentCreate create;
	StudentGetAll getAll;
	public ConnectionPool getConnection() {
		return connection;
	}
	public User(ConnectionPool connection,StudentCreate st,StudentGetAll gets) {
		super();
		this.connection = connection;
		create=st;
		getAll=gets;
	}
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public User() {
		System.out.println();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
