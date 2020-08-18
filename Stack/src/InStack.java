
public class InStack {
	
	private int top;
	private int[] stack;
	private int size;
	
	public InStack() {
		top=-1;
		this.size=50;
		stack=new int [size];
	}
	
	public InStack(int size) {
		this.size=size;
		top=-1;
		stack=new int [size];
	}
	
	public boolean push(int item) {
		if(!isFull()) {
			top++;
			stack[top]=item;
			return true;
		}
		return false;
		
	}

	public boolean isFull() {
		//System.out.println(stack.length);
		return (top==stack.length-1);
		
	}
	
	public int pop() {
		return stack[top--];		
	}

	public boolean isEmpty() {
		return (top==-1);
	}
	
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder();
		s.append('{');
		for(int i=0;i<top;i++) {
			s.append(stack[i]);
			s.append(',');
		}
		s.append('}');
		return s.toString();
	}

}
