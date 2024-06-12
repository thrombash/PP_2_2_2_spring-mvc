package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {

    @GetMapping("/users")
    public String getUsers() {
        return "userPages/usersGet";
    }

    @GetMapping("/edit")
    public String editUsers() {
        return "userPages/usersEdit";
    }
}
