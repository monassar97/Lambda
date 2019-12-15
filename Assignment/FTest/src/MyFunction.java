public interface MyFunction <T,U>{
	public U apply(T t);
	
	default <V>MyFunction<T, V> andThen(MyFunction<?super U,?extends V> after){
		
			return x->after.apply(apply(x));
		
	}
}
