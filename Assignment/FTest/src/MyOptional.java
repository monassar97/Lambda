import java.util.function.Consumer;
import java.util.function.Function;

public abstract class MyOptional<T> {
	public abstract T get();
	public abstract boolean isPresent();
	public abstract <U> MyOptional<U> map(Function<T, U> mapper);
	public abstract  MyOptional<T> consume(Consumer<T> consume);
	public abstract <E> MyOptional<E> of(E e);
}
