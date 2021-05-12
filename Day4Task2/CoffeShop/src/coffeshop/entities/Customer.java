package coffeshop.entities;

import java.util.Date;

import coffeshop.abstracts.Entity;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastname;
	private Date dateOfBirth;
	private String nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastname, Date dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
