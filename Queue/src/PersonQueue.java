
public class PersonQueue {
	private Person[] q;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	
	public PersonQueue() {
		size=100;
		total=0;
		front=0;
		rear=0;
		q=new Person[size];
	}
	
	public PersonQueue(int size) {
		this.size=100;
		total=0;
		front=0;
		rear=0;
		q=new Person[this.size];
	}
	
//	public boolean isFull() {
//		if(size==total) {
//			return true;
//		}
//		return false;
//	}
	
	public boolean enqueue(Person item) {
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
	
	public Person dequeue() {
		Person item=q[front];
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
