import java.util.function.Function;

public class Test {
	public static Function<Integer,Integer> add(){
		
		int c=5;
		Function<Integer, Integer> ret=x->x+5;
		c=7;
		return ret;
		
	}
	
	public static void main(String[] args) {
		System.out.println(add().apply(2));
		
		MyFunction<Integer, Integer> function=x->x+1;
		MyFunction<Integer, Integer> function2=x->x*x;
		MyFunction<Integer, Integer> a=function.compose(function2);
		MyFunction<Integer, Integer> b=function2.compose(function);
		System.out.println(a.apply(4));
		System.out.println(b.apply(4));
		MyFunction<Integer, Float> m=x->x*3F;
		System.out.println(m.apply(2));
		MyFunction<Integer, MyFunction<Integer, Integer>>e=x->y->x+y;
		e.apply(1).apply(2);
		
		MyFunction<String, Integer> function21=x->x.length();
		MyFunction<Integer, Boolean> function22=x->(x%2==0)?true:false;
		MyFunction<Boolean, Integer> function23=x->x?0:1;
		
		MyFunction<String,Boolean> res=function21.compose(function22);
		MyFunction<String, Integer> resw=function21.compose(function22).compose(function23);
		System.out.println(resw.apply("asdk"));
		
		
	}
}
