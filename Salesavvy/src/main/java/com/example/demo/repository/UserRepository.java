package com.example.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Userr;
@Repository
public interface UserRepository extends JpaRepository<Userr,Integer>{
  Optional<Userr> findByEmail(String email);
  Optional<Userr> findByUsername(String username);
}
