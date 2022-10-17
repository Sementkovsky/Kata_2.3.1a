package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/users")
    public String showUsers(Model model) {
        model.addAttribute("listUsers", userService.listUsers());
        return "users";
    }

    @RequestMapping(value="/add", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("user", new User());
        return "add";
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        userService.saveUser(user);
        return "result";
    }


    @GetMapping(value = "/delete")
    public String deleteUser(@RequestParam(value = "id", required = true) int id, User user, Model model) {
        model.addAttribute("user", user);
        System.out.println(id);
        userService.removeUser(id);
        return "result";
    }

}