public class DS {
	int value;
	int priorety;
	long time;

	public long getTime() {
		return time;
	}
	public void setTime() {
		
		this.time /=this.priorety;
	}
	public void setPriorety(int priorety) {
		this.priorety = priorety;
	}
	public DS(int value) {
		super();
		this.value = value;
		this.priorety=1;
		this.time = (long) System.currentTimeMillis();
	}
	public DS() {

	}
	public int getPriorety() {
		return priorety;
	}
	public void setPriorety() {
		++this.priorety;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
