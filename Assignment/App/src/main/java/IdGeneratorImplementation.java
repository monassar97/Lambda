public class IdGeneratorImplementation implements IdGenerator{
	
	private int id;
	public int generateId() {
		return id++;
	}
}
