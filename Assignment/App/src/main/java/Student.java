import java.util.List;
public class Student {
	private int id;
	private String name;
	private List<Courses> courses;
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, List<Courses> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
}
