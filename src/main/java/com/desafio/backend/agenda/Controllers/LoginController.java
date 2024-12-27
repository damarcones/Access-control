package com.desafio.backend.agenda.Controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



/**
 *
 * @author damarcones
 */

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/home")
    public String welcomePage(Model model, Authentication authentication) {
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "bemVindo";
    }

}
