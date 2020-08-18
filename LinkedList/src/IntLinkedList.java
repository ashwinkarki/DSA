
public class IntLinkedList {
	
	private Node head;
	
	public IntLinkedList() {
		head=new Node();
		//initializing headvalue as zero
		head.value=0;
		head.link=null;
	}
	
	public boolean insertItem(int item) {
		Node n=new Node();
//		n.value=item;
//		n.link=head;
//		head=n;
		Node new_node=new Node();
		new_node=head;
		
		while(new_node.link!=null) {
			new_node=new_node.link;
		}
		
		n.value=item;
		n.link=null;
		new_node.link=n;
		return true;
	}
	
	public void printList() {
		//consider from 2nd node becoause first is head
		Node z=head.link;
		while(z!=null) {
			System.out.println(z.value);
			z=z.link;
//			if(z.link==null) {
//				System.out.println(z.value);
//				break;
//			}
		}
		
	}
	
	//sorting
	public void sortList() {
		int c=0;
		Node a=head.link;
		while(a.link!=null) {
			Node b=head.link;
			while(b.link!=null) {
				if(b.value>b.link.value) {
					c=b.value;
					b.value=b.link.value;
					b.link.value=c;
					
				}
				b=b.link;
			}
			a=a.link;
		}
	}
	
	public boolean deleteNode(int item) {
		if(head.link.value==item) {
			head.link=head.link.link;
		}
		else {
			Node x=head;
			Node y=head.link;
		while(true) {
			if(y==null || y.value==item) {
				break;
			}
			else {
				x=y;
				y=y.link;
			}
		}
		
		//if item found
		if(y!=null) {
			x.link=y.link;
			return true;
		}
		}
		
		return false;
	}
	
	public boolean insertAtEnd(int item) {
		Node z=head;
		
		while(z.link!=null) {
			
			z=z.link;
		}
		
			Node n=new Node();
			
			n.link=null;
			n.value=item;
			z.link=n;
			//System.out.println(z.value+"vlaue of z");
			
			return true;
		
		
	}

}
