public interface StudentsDAO {
	public void CreateStudent(String name);
	public void deleteStudent(Student student);
	public void deleteStudentById(long id);
	public void updateStudent(long id,String newName);
	
}
