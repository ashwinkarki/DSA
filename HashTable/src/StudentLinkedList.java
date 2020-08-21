
public class StudentLinkedList {
	private Node h;
	
	public StudentLinkedList() {
		h=new Node();
		h.next=null;
		h.data=null;
	}
	
	public boolean insert(Student std) {
			Node n=new  Node();
			n.data=std;
			n.next=h.next;
			h.next=n;
			return true;
	}
	
	public boolean haveRollNo(String rollNo) {
		Node a=h.next;
		boolean have=false;
		while(a!=null) {
			if(rollNo.equals(a.data.getRollNo())) {
				have=true;
			}
			a=a.next;
		}
		return have;
	}
	
	
	public Student fetchStudent(String rollNo) {
		Student data=null;
		Node p=h.next;
		while(p!=null) {
			if(p.data.getRollNo().equals(rollNo)) {
				data=p.data;
				break;
			}
			p=p.next;
		}
		return data;
	}
	
	public void deleteStudent(String rollNo) {
		Node p=h;
		Node q=h.next;
		
		while(q!=null && !(q.data.getRollNo().equals(rollNo))) {
			p=q;
			q=q.next;
		}
		
		if(q!=null) {
			p.next=q.next;
		}
		else {
			//no data found
		}
	}
	
	public void showAll() {
		Node x=h.next;
		while(x!=null) {
			System.out.println(x.data);
			x=x.next;
		}
	}
}
