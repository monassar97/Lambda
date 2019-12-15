import java.util.Arrays;
import java.util.List;

public class TestGenerics2 {
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(1,2,3,4,5);
		List<Number> numbers=Arrays.asList(1,2,3,4,5,6);
		List<Object> objetcs=Arrays.asList(1,2,3,4,5,6,7);
//		System.out.println(sum(integers));
//		System.out.println(sum(numbers));
		System.out.println(sum2(integers));
		objetcs.add("asd");
		//add5(objetcs);
		System.out.println(objetcs.toString());
	}
	public static void add5(List<?super Number> numbers) {
		numbers.add(5);

	}
	public static double sum2(List<? extends Number> objetcs) {
		return objetcs.stream().mapToDouble(x->x.doubleValue()).sum();
	}
}
