package com.ashley.maven_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashley.maven_demo.domain.Login;
import com.ashley.maven_demo.repository.LogRepo;

@Service
public class LogService {
    @Autowired
    private LogRepo rep;
            public Login log(String username, String password){
                Login user = rep.findByUsernameAndPassword(username, password);
                return user;
}
}