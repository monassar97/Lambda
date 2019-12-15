public class Pair<K,V>{
		final K key;
		 V value;
		 Pair<K, V> next;
		public Pair(K key, V value, Pair<K, V> next) {
			super();
			this.key = key;
			this.value = value;
			this.next = next;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}
		
	}