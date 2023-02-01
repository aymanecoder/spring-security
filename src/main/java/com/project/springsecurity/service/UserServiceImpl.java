package com.project.springsecurity.service;

import com.project.springsecurity.models.Role;
import com.project.springsecurity.models.User;
import com.project.springsecurity.repo.RoleRepo;
import com.project.springsecurity.repo.UserRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.List;
@Service  @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    @Override
    public User saveUser(User user) {
        log.info("saving new user {} to database",user.getName());
        return userRepo.save(user);
    }
    @Override
    public Role saveRole(Role role) {
        log.info("saving new {} role to database",role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
            log.info("adding role {} to user {}",roleName,username);
            User user = userRepo.findByUsername(username);
            Role role = roleRepo.findByName(roleName);
            user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("fetch user {}",username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }
}
