
public class Student {
	
	private String name;
	private String rollNo;
	private double cgpa;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public Student(String name, String rollNo, double cgpa) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
	}
	
	public String toString() {
		return "Name:"+name+" "+"rollNo"+rollNo+" "+"cgpa"+" "+cgpa;
	}
}
