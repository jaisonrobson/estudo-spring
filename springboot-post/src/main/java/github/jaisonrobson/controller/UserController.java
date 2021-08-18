package github.jaisonrobson.controller;

import github.jaisonrobson.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String usersForm(final Model model) {
        model.addAttribute("user", new User());

        return "userForm";
    }

    @PostMapping
    public String result(@ModelAttribute User user) {
        return "result";
    }
}
