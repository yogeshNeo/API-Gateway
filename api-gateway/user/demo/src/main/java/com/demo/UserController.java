package com.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping(path = "/user/{data}")
    public void saveUser(@PathVariable String data) {
        System.out.println("Inside Service 1 User :::: " + data);
    }

}
