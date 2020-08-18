
public class InStackGeneric<T> {
	
	private int top;
	private T[] stack;
	private int size;
	
	public InStackGeneric() {
		top=-1;
		this.size=50;
		stack=(T[])new Object[50];
	}
	
	public InStackGeneric(int size) {
		this.size=size;
		top=-1;
		stack=(T[])new Object[size];
	}
	
	public boolean push(T item) {
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
	
	public T pop() {
		return stack[top--];		
	}

	public boolean isEmpty() {
		return (top==-1);
	}
	
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder();
		s.append('{');
		for(int i=0;i<=top;i++) {
			s.append(stack[i]);
			s.append(',');
		}
		s.append('}');
		return s.toString();
	}

}
