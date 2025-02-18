package com.example.demo.dto;

public class LoginRequest {
  private String username;
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
public LoginRequest(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
private String password;
  public LoginRequest() {

  }

}
