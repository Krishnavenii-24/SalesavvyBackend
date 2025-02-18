package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Userr;
import com.example.demo.repository.UserRepository;
@Service
public class UserService {
  private final UserRepository userRepository;
  private final BCryptPasswordEncoder passwordEncoder;
  @Autowired
  public UserService(UserRepository userRepository) {
	  this.userRepository=userRepository;
	  this.passwordEncoder=new BCryptPasswordEncoder();
  }
  public Userr registerUser(Userr user) {
	  if(userRepository.findByUsername(user.getUsername()).isPresent()) {
		  throw new RuntimeException("User name is already Taken");
	  }
	  if(userRepository.findByEmail(user.getEmail()).isPresent()) {
		  throw new RuntimeException("Email is already registered");
	  }
	  user.setPassword(passwordEncoder.encode(user.getPassword()));
	  return userRepository.save(user);

  }
}
