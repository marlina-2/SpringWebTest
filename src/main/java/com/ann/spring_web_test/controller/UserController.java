package com.ann.spring_web_test.controller;


import com.ann.spring_web_test.model.User;
import com.ann.spring_web_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ann on 30.05.17.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("newUser", new User());
            return "login";

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("newUser") User user, Model model){
        User userFromDB = userService.getUser(user);
        model.addAttribute("userFromDB", userFromDB);
        return "welcome";
    }

    @RequestMapping ("/registration")
    public String registration(Model model){
        model.addAttribute("newUser", new User());
        return "registration";

    }
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("newUser") User user){
        userService.addUser(user);
        return "home";
    }
}
