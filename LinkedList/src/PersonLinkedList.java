
public class PersonLinkedList {
	
	private PersonNode head;
	
	public PersonLinkedList(Person person) {
		head=new PersonNode();
		//initializing headvalue as zero
		head.person=person;
		head.link=null;
	}
	
	public boolean insertItem(Person person) {
		PersonNode n=new PersonNode();
//		n.value=item;
//		n.link=head;
//		head=n;
		PersonNode new_PersonNode=new PersonNode();
		new_PersonNode=head;
		
		while(new_PersonNode.link!=null) {
			new_PersonNode=new_PersonNode.link;
		}
		
		n.person=person;
		n.link=null;
		new_PersonNode.link=n;
		return true;
	}
	
	public void printList() {
		//consider from 2nd PersonNode becoause first is head
		PersonNode z=head;
		while(z!=null) {
			System.out.println(z.person.toString());
			z=z.link;
//			if(z.link==null) {
//				System.out.println(z.value);
//				break;
//			}
		}
		
	}
	
	//sorting
//	public void sortList() {
//		int c=0;
//		PersonNode a=head.link;
//		while(a.link!=null) {
//			PersonNode b=head.link;
//			while(b.link!=null) {
//				if(b.value>b.link.value) {
//					c=b.value;
//					b.value=b.link.value;
//					b.link.value=c;
//					
//				}
//				b=b.link;
//			}
//			a=a.link;
//		}
//	}
	
	public boolean deletePersonNode(String name) {
		if(name.equals (head.person.getFirstName())) {
			head=head.link;
		}
		else {
			PersonNode x=head;
			PersonNode y=head.link;
		while((y!=null) && !(y.person.getFirstName().equals(name))) {
			x=y;
			y=y.link;
			
		}
		
		//if item found
		if(y!=null) {
			x.link=y.link;
			return true;
		}
		}
		
		return false;
	}
	
	public boolean insertAtEnd(Person item) {
		PersonNode z=head;
		
		while(z.link!=null) {
			
			z=z.link;
		}
		
			PersonNode n=new PersonNode();
			
			n.link=null;
			n.person=item;
			z.link=n;
			//System.out.println(z.value+"vlaue of z");
			
			return true;
		
		
	}

}
