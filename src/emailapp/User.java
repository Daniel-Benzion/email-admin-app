package emailapp;

public class User {

	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;

	public User(String firstName, String lastName, String department) {
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
