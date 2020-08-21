
public class Hashtable {
	private StudentLinkedList[] arr;
	private int size;
	private int totalstudents;
	
	public Hashtable() {
		size=1000;
		arr=new StudentLinkedList[size];
		
	}
	
	public int toHashCode(String rollNo) {
		int addasciis=0;
		int codevalue=0;
		for(int i=0;i<rollNo.length();i++) {
			addasciis=addasciis+(int)rollNo.charAt(i);
		}
		codevalue=addasciis % arr.length;
		return codevalue;
	}
	
	public boolean insert(int key,Student data) {
		if(arr[key]==null) {
			arr[key]=new StudentLinkedList();
		}
		
		arr[key].insert(data);
		totalstudents++;
		return true;
	}
	
	public int getTotal() {
		return totalstudents;
	}
	
	public Student fetchStdInfo(String rollNo) {
		int key=toHashCode(rollNo);
		if(arr[key]==null) {
			return null;
		}
		else {
			Student q=arr[key].fetchStudent(rollNo);
			if(q!=null) {
				return q;
			}else {
				return null; 
			}
		}
	}
	
	public boolean deleteStd(String rollNo) {
		boolean have=arr[toHashCode(rollNo)].haveRollNo(rollNo);
		if(have) {
			int key=toHashCode(rollNo);
			arr[key].deleteStudent(rollNo);
			totalstudents--;
			return true;
		}
		return false;
	}
	
	public void showData() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				arr[i].showAll();
			}
		
		}
	}
		
}
