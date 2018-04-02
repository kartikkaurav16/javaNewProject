package com.semanticsquare.thrillio.entities;

public class User {
@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userType=" + userType + ", id=" + id + ", gender=" + gender + "]";
	}
private String email; 
private String password;
private String firstName;
private String lastName;
private String userType;
private long id; 
private int gender;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getGender() {
	return gender;
}
public void setGender(int gender) {
	this.gender = gender;
}

}
