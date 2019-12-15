import java.util.LinkedList;
import java.util.List;

public class ConnectionPool implements ConnectionPoolInterface{
	
	List<Integer> connections=new LinkedList<Integer>();
	private RepoImplementation repo;
	
	public RepoImplementation getRepo() {
		return repo;
	}

	public ConnectionPool() {
	}

	public void getConnection(final int id) {
		Thread t=new Thread(new Runnable() {
			public void run() {
				connections.add(id);
				System.out.println(connections.toString());
			}
		});
		t.start();
	}
	
	public void releaseConnection(final int id) {
		Thread t=new Thread(new Runnable() {
			public void run() {
				connections.remove(id);
			}
		});
		t.start();
	}
}
