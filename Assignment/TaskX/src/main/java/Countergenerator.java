
public class Countergenerator implements InterfaceGenerator{
	static int count=0;
	public int getCount() {
		return count++;
	}

}
