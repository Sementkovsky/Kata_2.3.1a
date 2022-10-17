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


  /*

    @GetMapping(value = "/users/add")
    public String addUsersForm(Model model) {
        User user = new User();
        model.addAttribute("add", true);
        model.addAttribute("contact", user);
        return "old1";
    }

        @PostMapping(value = "/users/add")
        public String addContact(Model model,
                @ModelAttribute("user") User user) {
            try {
                User newUser = userService.saveUser(user);
                return "redirect:/users/" + newUser.getId();
            } catch (Exception ex) {
                // log exception first,
                // then show error
                String errorMessage = ex.getMessage();
              //  logger.error(errorMessage);
                model.addAttribute("errorMessage", errorMessage);

                //model.addAttribute("contact", contact);
                model.addAttribute("add", true);
                return "old1";
            }
        }

        //  @RequestMapping(method = RequestMethod.GET)
        //  public ModelAndView allFilms() {
        //      List<User> users = userService.listUsers();
        //      ModelAndView modelAndView = new ModelAndView();
        //      modelAndView.setViewName("users");
        //       modelAndView.addObject("userList", users);
        //       return modelAndView;
        //  }
*/

    }
