import java.util.Arrays;
import java.util.List;
public class Student {
	private final String name;
	private final int age;
	private final Gender gender;
	private final boolean active;
	private final List<Course> courses;
	public Student(String name, int age, Gender gender, boolean active, List<Course> courses) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.active = active;
		this.courses = courses;
	}
	
	public static Student student(String name, int age, Gender gender, boolean active, Course... c) {
		return new Student(name, age, gender, active, Arrays.asList(c));
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", active=" + active + ", courses="
				+ courses + "]";
	}

	public Gender getGender() {
		return gender;
	}
	public boolean isActive() {
		return active;
	}
	public List<Course> getCourses() {
		return courses;
	}
}
