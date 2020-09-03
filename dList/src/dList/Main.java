package dList;

public class Main {
   public static void main(String[] args) {
	   dList d=new dList(10);
	   d.insertItem(3);
	   d.insertItem(6);
	   
	   d.printList();
	   
	   System.out.println();
	   d.deleteNode(3);
	   d.printList();
}
}
