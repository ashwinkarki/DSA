package dList;

public class dList {
	
private Node head;
	//doubly linked list
	public dList(int value) {
		head=new Node();
		head.value=value;
		head.prev=null;
		head.next=null;
	}
	
	public boolean insertItem(int item) {
			Node n=new Node();
			n.value=item;
			n.prev=null;
			head.prev=n;
			n.next=head;
			head=n;
			return true;
	}
	
	public void printList() {
		//consider from 2nd node becoause first is head
		Node z=head;
		while(z!=null) {
			System.out.println(z.value);
			z=z.next;
		}
		
	}
	
	
	public boolean deleteNode(int item) {
		if(head.value==item) {
			head=head.next;
		}
		else {
			Node x=head;
			Node y=head.next;
		while(true) {
			if(y==null || y.value==item) {
				break;
			}
			else {
				x=y;
				y=y.next;
			}
		}
		
		//if item found
		if(y!=null) {
			x.next=y.next;
			return true;
		}
		}
		
		return false;
	}
	
	

}
