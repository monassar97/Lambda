import javax.xml.soap.Text;

public class Test  {
	static int x=0;
	public synchronized static void print() {
		synchronized (Text.class) {
			
		}{
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"-i is : "+x++);
		}
		}
	}
	public synchronized static void print2() {
		synchronized (Text.class) {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"-i is : "+x--);
		}
		}
	}
}
