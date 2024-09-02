package project.oop;

public class Student extends User {

	private String name ;
	private String surName;
	private String nisitCode;
	
	public Student(String userName, String pwd,String name,String surName,String nisitCode) {
		super(userName, pwd);
		this.name = name ;
		this.surName = surName;
		this.nisitCode = nisitCode;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getNisitCode() {
		return nisitCode;
	}

	public void setNisitCode(String nisitCode) {
		this.nisitCode = nisitCode;
	}

}
