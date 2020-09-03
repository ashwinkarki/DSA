
public class BST {
	
	private Node root;
	
	public BST() {
		root=null;
	}
	
	public boolean insert(Person item) {
		Node n=new Node();
		n.data=item;
		n.lc=null;
		n.rc=null;
		if(root==null) {
			root=n;
			return true;
		}
		Node p=root;
		Node c=root;
		
		while(c!=null) {
			p=c;
			if(item.getFirstName().compareTo(c.data.getFirstName())<0) {
				c=c.lc;
			}else {
				c=c.rc;
			}
		}
		
		if(item.getFirstName().compareTo(p.data.getFirstName())<0) {
			p.lc=n;
			
		}else {
			p.rc=n;
		}
		
		return true;
	}
	
	public void showAll(Node n) {
		Node p=n;
		if(p!=null) {
			System.out.println(" "+p.data);
			showAll(p.lc);
			showAll(p.rc);
		}
	}
	
	public Node findNode(String key) {
		Node c=root;
		while(c!=null) {
			if(key.compareTo(c.data.getFirstName())==0) {
				break;
			}
			if(key.compareTo(c.data.getFirstName())<0) {
				c=c.lc;
			}
			else {
				c=c.rc;
			}
		}
		return c;
	}
	
	public Node findParent(String key) {
		Node p=root;
		Node c=root;
		
		do {
			if(key.compareTo(c.data.getFirstName())==0) {
				break;
			}
			p=c;
			if(key.compareTo(c.data.getFirstName())<0) {
				c=c.lc;
			}
			else {
				c=c.rc;
			}
		}while(c!=null);
		System.out.println(">>"+p.data.getFirstName());
		if(c!=null) {
			return p;
		}
		else {
			return null;
		}
	}
	
	public Person getData(Node n) {
		return n.data;
	}

}
