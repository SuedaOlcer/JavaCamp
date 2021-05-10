
public class Student extends User {
	String email;

	public Student(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
