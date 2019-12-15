public class APP {
	public static void main(String[] args) throws InterruptedException {
		
		Cache.add(1);
		Cache.add(2);
		Cache.add(3);
		Cache.add(4);
		
		Cache.print();
		
		Cache.get(4);
		
		Cache.add(5);
		
		Cache.print();
	}
}
