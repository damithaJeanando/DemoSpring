package com.damitha.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    User user = new User();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public User index(){
        user.setId("01");
        user.setName("Damitha");
        user.setAge(24);

        return user;
    }
}
