package com.project.springsecurity;

import com.project.springsecurity.models.Role;
import com.project.springsecurity.models.User;
import com.project.springsecurity.security.RsakeysConfig;
import com.project.springsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
@EnableConfigurationProperties(RsakeysConfig.class)
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

//    @Bean
//    CommandLineRunner run(UserService userService){
//        return args -> {
//          userService.saveRole(new Role(null,"Rolle_USER"));
//          userService.saveRole(new Role(null,"Rolle_MANAGER"));
//          userService.saveRole(new Role(null,"Rolle_ADMIN"));
//          userService.saveRole(new Role(null,"Rolle_SUPER_ADMIN"));
//
//          userService.saveUser(new User(null,"aymane biti","aymane","1234",new ArrayList<>()));
//          userService.saveUser(new User(null,"will smith","will","1234",new ArrayList<>()));
//          userService.saveUser(new User(null,"mohamed laghrissi","mohamed","1234",new ArrayList<>()));
//          userService.saveUser(new User(null,"yassine oussi","yassine","1234",new ArrayList<>()));
//
//          userService.addRoleToUser("mohamed","Rolle_USER");
//          userService.addRoleToUser("mohamed","Rolle_MANAGER");
//          userService.addRoleToUser("will","Rolle_MANAGER");
//          userService.addRoleToUser("yassine","Rolle_ADMIN");
//          userService.addRoleToUser("aymane","Rolle_USER");
//          userService.addRoleToUser("aymane","Rolle_ADMIN");
//          userService.addRoleToUser("aymane","Rolle_SUPER_ADMIN");
//        };
//    }

}
