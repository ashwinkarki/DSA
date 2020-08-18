
public class Main {
	
	public static void main(String[] args) {
		InStack inStack=new InStack();
		if(!inStack.isFull()) {
			inStack.push(10);
			inStack.push(20);
			inStack.push(30);
			inStack.push(40);
			inStack.push(50);
		}
		
		System.out.println(inStack);
		System.out.println(inStack.pop());
		
		InStackGeneric<Person> p=new InStackGeneric<Person>();
		if(!p.isFull()) {
			p.push(new Person(1,"Ashwin"));
			p.push(new Person(2,"Suman"));
			p.push(new Person(3,"Guman"));
		}
		
		System.out.println(p);
		System.out.println("pop out");
		System.out.println(p.pop());
	
		
		InStackGeneric<Integer> p1=new InStackGeneric<Integer>();
		if(!p1.isFull()) {
			p1.push(12);
			p1.push(100);
			p1.push(2200);
		}
		
		System.out.println(p1);
		System.out.println("pop out");
		System.out.println(p1.pop());
		System.out.println(p1.pop());
		System.out.println(p1.pop());
	}

}
