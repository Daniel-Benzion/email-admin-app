package emailapp;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;

	public Email(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = firstName + "." + lastName + "@" + department + ".company.com";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
		this.email = firstName + "." + lastName + "@" + department + ".company.com";
	}

	public String getEmail() {
		return email;
	}


}
