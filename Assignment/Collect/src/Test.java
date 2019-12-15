
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
	Map<String, Double>map=new HashMap<String, Double>();
	map.put("euro", .091);
	map.put("dollar",0.71);
	double sal=2700.0;
	System.out.println(sal*map.get("dollar"));
	map.put("dollar",0.25);
	System.out.println(sal*map.get("dollar"));
	}
}
