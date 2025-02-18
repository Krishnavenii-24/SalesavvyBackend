package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jwt_tokens")
public class JWTToken {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer tokenId;
   @ManyToOne
   @JoinColumn(name="user_id",nullable=false)
   private Userr user;
   @Column(nullable=false)
   private String token;
   @Column(nullable=false)
   private LocalDateTime expiresAt;
public JWTToken(Integer tokenId, Userr user, String token, LocalDateTime expiresAt) {
	super();
	this.tokenId = tokenId;
	this.user = user;
	this.token = token;
	this.expiresAt = expiresAt;
}
public JWTToken(Userr user, String token, LocalDateTime expiresAt) {
	super();
	this.user = user;
	this.token = token;
	this.expiresAt = expiresAt;
}
public Integer getTokenId() {
	return tokenId;
}
public void setTokenId(Integer tokenId) {
	this.tokenId = tokenId;
}
public Userr getUser() {
	return user;
}
public void setUser(Userr user) {
	this.user = user;
}
public String getToken() {
	return token;
}
public void setToken(String token) {
	this.token = token;
}
public LocalDateTime getExpiresAt() {
	return expiresAt;
}
public void setExpiresAt(LocalDateTime expiresAt) {
	this.expiresAt = expiresAt;
}
  public JWTToken() {

  }

}
