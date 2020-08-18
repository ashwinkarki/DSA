
public class Person {
	private int id;
	private String firstName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Person(int id, String firstName) {
		
		this.id = id;
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + "]";
	}
	
	
	
}
