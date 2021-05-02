package Entities;

public class Customer {
	
	int id;
	String firstName;
	String lastName;
	long nationalityId;
	int birtYear;
	
	public Customer(int id, String firstName, String lastName, long nationalityId, int birtYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birtYear = birtYear;
	}

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getBirtYear() {
		return birtYear;
	}

	public void setBirtYear(int birtYear) {
		this.birtYear = birtYear;
	}
	

}
