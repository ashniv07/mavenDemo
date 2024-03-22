package com.ashley.maven_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashley.maven_demo.domain.Login;

@Repository
public interface LogRepo extends JpaRepository<Login,String>{
    Login  findByUsernameAndPassword(String username, String password);
    }
