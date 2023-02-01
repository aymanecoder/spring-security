package com.project.springsecurity.repo;

import com.project.springsecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
