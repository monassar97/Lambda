
public class MyHashMap <K,V>{
	
	private Pair<K, V>[] buckets;
	private final int capacity=10;
	private int size = 0;
	public MyHashMap() {
		
	}
	public MyHashMap(int capacity) {
        this.buckets = new Pair[capacity];
    }
	public void put(K key,V value) {
		Pair<K, V> pair=new Pair<>(key,value,null);
		
	}
	
	
	
}
