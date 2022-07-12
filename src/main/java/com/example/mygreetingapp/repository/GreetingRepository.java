package com.example.mygreetingapp.repository;

import com.example.mygreetingapp.module.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<User, Long> {

}
