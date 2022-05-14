package coderscampus;

//POJO = Plain Old Java Object
public class User {
	
	//instance variables (declared as private)
	private String username;
	private String password;
	private String name;
	private int unsuccessfulLoginAttempts;
	
	// getters and setters for the above instance variables
	public String getUserName () {
		return username;
	}

	public void setUsername (String username) {
			this.username = username;	
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String firstName) {
		this.name = firstName;
	}

	public int getUnsuccessfulLoginAttempts() {
		return unsuccessfulLoginAttempts;
	}

	public void setUnsuccessfulLoginAttempts(int unsuccessfulLoginAttempts) {
		this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
	}
	
}


