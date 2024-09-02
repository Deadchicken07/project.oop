package project.oop;

public class User {
	private String userName ;
	private String password;

	
	public User(String userName,String pwd) {
		this.userName = userName;
		this.password = pwd ;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
		
}
