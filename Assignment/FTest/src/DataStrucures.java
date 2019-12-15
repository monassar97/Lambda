import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Stream;

public class DataStrucures {
	public static boolean solve() {
		String str="([{}])";
		Deque<Character> stack=new LinkedList<Character>();
		for (int i = 0; i < str.length(); i++)
	    {
	        char current = str.charAt(i);
	        if (current == '{' || current == '(' || current == '[')
	        {
	            stack.push(current);
	        }

	        if (current == '}' || current == ')' || current == ']')
	        {
	            if (stack.isEmpty())
	                return false;
	           
	            char last=stack.poll();
	            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	                continue;
	            else 
	                return false;
	        }

	    }

	        return stack.isEmpty();
	}
	private static boolean balanced(String input) {
	    return input.chars().mapToDouble(i -> i == '(' ? 1 : i == ')' ? -1 : 0).reduce(0,
	            (a, b) -> a == 0 && b == -1 ? Double.NaN : a + b) == 0;
	}
	public static void main(String[] args) {
//		System.out.println(solve());
//		
//		System.out.println(balanced(")(())"));
		
		Queue<Integer> queue=new ArrayBlockingQueue<Integer>(10000);
		for(int i=0;i<100;i++) {
			new Thread(() -> {
				
					for(int j=0;j<100;j++) {
						queue.add(10);
					}
					
			}).start();
			
		}
		System.out.println(queue.size());
	}
}
