package com.example.demopostgres.resource;

import com.example.demopostgres.model.User;
import com.example.demopostgres.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/db/user")
public class UserResource {

    private UsersRepository usersRepository;

    public UserResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("")
    public List<User> getUsers(){
        return usersRepository.findAll();
    }
}
