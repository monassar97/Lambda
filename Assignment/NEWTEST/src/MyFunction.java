public interface MyFunction <T,U>{
	public U apply(T t);
	
	default <V>MyFunction<T, V> compose(MyFunction<U, V> m){
		return x->m.apply(apply(x));
	}
}