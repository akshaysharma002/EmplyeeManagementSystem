package com.Akshay.fullstackbackend.repository;


import com.Akshay.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
