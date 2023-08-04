package com.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @PostMapping(path = "/order/{data}")
    public void saveUser(@PathVariable String data) {
        System.out.println("Inside Order 2 Service :::: " + data);
    }

}
