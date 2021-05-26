package com.cvgras.cvgras.controller;

import com.cvgras.cvgras.model.ResponseRID;
import com.cvgras.cvgras.model.UserModel;
import com.cvgras.cvgras.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api/cv")
public class ControllerCV {
    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user")
    public List<UserModel> findAllUsers() {
        return userService.getAllUsers();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/{id}")
    public UserModel findUserById(@PathVariable String id){
        return  userService.findUserById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/user")
    public ResponseRID postUser(@RequestBody UserModel request) {
        return userService.createUser(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/user/{id}")
    public UserModel putUser(@RequestBody UserModel request, @PathVariable String id) {

        return userService.updateUserById(request, id);

    }
}

