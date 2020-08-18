
public class Main {
    public static void main(String[] args) {
		IntLinkedList in=new IntLinkedList();
		in.insertItem(800);
		in.insertItem(200);
		in.insertItem(300);
	in.printList();
	in.sortList();
	in.printList();
//	in.deleteNode(200);
//	System.out.println("deleting items");
//	in.printList();
//	System.out.println("--------------");
//	boolean z=in.insertAtEnd(400);
//	System.out.println(z);
	//in.printList();
	Person p1=new Person(1,"ashwin");
	Person p2=new Person(2,"karki");
	Person p3=new Person(3,"suman");
	
	PersonLinkedList personList=new PersonLinkedList(p1);
	personList.insertItem(p2);
	personList.insertItem(p3);
	
	personList.printList();
	personList.deletePersonNode("ashwin");
	personList.printList();

	}
}
