
public class Main {
	
	public static void main(String[] args) {
		System.out.println("hello");
//		Student[] s=new Student[10];
//		System.out.println(s[1]);
		
		Hashtable hashTable=new Hashtable();
		Student s1=new Student("Ashwin","15-123",4.0);
		Student s5=new Student("Bhawanw","123-15",4.0);
		Student s2=new Student("Suju","15-124",1.0);
		Student s3=new Student("Kamana","153-3",2.0);
		Student s4=new Student("Katha","1533-123",3.0);
		
		int getKey1=hashTable.toHashCode(s1.getRollNo());
		int getKey2=hashTable.toHashCode(s2.getRollNo());
		int getKey3=hashTable.toHashCode(s3.getRollNo());
		int getKey4=hashTable.toHashCode(s4.getRollNo());
		int getKey5=hashTable.toHashCode(s5.getRollNo());
		
		hashTable.insert(getKey1, s1);
		hashTable.insert(getKey2, s2);
		hashTable.insert(getKey3, s3);
		hashTable.insert(getKey4, s4);
		hashTable.insert(getKey5, s5);
		
		//hashTable.showData();
		//System.out.println(hashTable.fetchStdInfo(s1.getRollNo()));
		hashTable.deleteStd(s1.getRollNo());
			
		hashTable.showData();
	}

}
