
public class Main {
   public static void main(String[] args) {
	   InQueue in=new InQueue();
	   
	   in.enqueue(10);
	   in.enqueue(20);
	   in.enqueue(30);
	   in.enqueue(40);
	   
	   //System.out.println(in);
	   in.show();
	   System.out.println("dequing");
	   
	   System.out.println(in.dequeue());
	   System.out.println(in.dequeue());
	   System.out.println(in.dequeue());
	   System.out.println(in.dequeue());
	   
	   PersonQueue pq=new PersonQueue();
	   pq.enqueue(new Person(1,"Ashwin"));
	   pq.enqueue(new Person(2,"SUJU"));
	   pq.enqueue(new Person(3,"RUJu"));
	   
	   System.out.println(pq);
	   
}
}
