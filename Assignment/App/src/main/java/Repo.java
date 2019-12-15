import java.util.List;

public interface Repo {
	public void createStudent(Student student);
	public Student getStudent(int id);
	public void deleteStudentById(int id);
	public void updateStudent(Student student);
	public List <Student> getAllStudents();
}
