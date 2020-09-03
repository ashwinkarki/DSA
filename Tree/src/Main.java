
public class Main {
   public static void main(String[] args) {
	   Person p1=new Person(1,"ashwin");
		Person p2=new Person(2,"karki");
		Person p3=new Person(3,"suman");
		Person p4=new Person(4,"shrestha");

		BST bst=new BST();
		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		 
		bst.showAll(bst.findNode("shrestha"));
		
		Person p=bst.getData(bst.findParent("ashwin"));
		
		System.out.println(p.toString());
}
}
