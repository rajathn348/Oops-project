package com;

public class mail {
	private String email;
	private String password;
	public void setEmail(String email) {
		if (email.contains("@")){
			this.email=email;
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Invalid Email");
		}
	}
	public String getEmail() {
	return email;
}
	public void setPassword(String password) {
		if(password.length()>=8) {
			this.password=password;
			System.out.println("password is valid");
		
		}
		else {
			System.out.println("invalid password");
	}
	}
	public String getPasword() {
		return password;
	}
}
