
public class InQueue {
	private int[] q;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	
	public InQueue() {
		size=100;
		total=0;
		front=0;
		rear=0;
		q=new int[size];
	}
	
	public InQueue(int size) {
		this.size=100;
		total=0;
		front=0;
		rear=0;
		q=new int[this.size];
	}
	
//	public boolean isFull() {
//		if(size==total) {
//			return true;
//		}
//		return false;
//	}
	
	public boolean enqueue(int item) {
		if(isFull()) {
			return false;
		}
		else {
			total++;
			q[rear]=item;
			rear=(rear+1)%size;
			return true;
		}
	}
	
	public boolean isFull() {
		return (size==total);
	}
	
	public int dequeue() {
		int item=q[front];
		total--;
		front=(front+1)%size;
		return item;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append('{');
		int start=front;
		int end=rear;
		
		while(start<end) {
			sb.append(q[start]);
			sb.append(',');
			start++;
		}
		
		sb.append('}');
		return sb.toString();
	}
	
	public void show() {
		int f=front;
		if(total!=0) {
			for(int i=0;i<total;i++) {
				System.out.println(" "+q[f]);
				f=(f+1)%size;
				
			}
		}
	}
}
