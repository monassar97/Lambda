import java.util.HashMap;

public class Student {
	private long id;
	private String name;
	static HashMap<Long, String> map=new HashMap<Long, String>();

	public Student() {
		
	}
	public Student(long id) {
		this.id=id;
	}

	public Student(long id,String name) {
		this(id);
		this.name = name;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}