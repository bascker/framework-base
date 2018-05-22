package com.bascker.framework.controller;

import com.bascker.framework.model.User;
import com.bascker.framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User Controller
 *
 * @author bascker
 */

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User get(@PathVariable("id") final String id) {
        return userService.get(id);
    }

}
