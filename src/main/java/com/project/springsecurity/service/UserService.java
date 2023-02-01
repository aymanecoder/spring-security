package com.project.springsecurity.service;

import com.project.springsecurity.models.Role;
import com.project.springsecurity.models.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();


}
