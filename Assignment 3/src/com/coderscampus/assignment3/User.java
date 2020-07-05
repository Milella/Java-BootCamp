package com.coderscampus.assignment3;

public class User {

	private String username;
	private String password;
	private String name;
	private String role;
	
	public User () {
		System.out.println("A No argument constructor has created a user");
	}
	
	public User (String username, String password, String name, String role) {
		this.username=username;
		this.password=password;
		this.name=name;
		this.role=role;
	}
	
	public User (String[] credentials) {
		this.username = credentials[0];
		this.password = credentials[1];
		this.name = credentials[2];
		this.role = credentials[3];
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
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

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

		
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
}