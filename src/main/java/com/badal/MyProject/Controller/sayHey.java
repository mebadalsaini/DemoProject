package com.badal.MyProject.Controller;

import com.badal.MyProject.Authentication.AuthenticationService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;

@Controller
@SessionAttributes("name")
public class sayHey {
    private AuthenticationService authenticationService;

    public sayHey(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("hey-chad")
    @ResponseBody
    public String heyController() {
        return "Hello! What are you learning today?";
    }
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLoginJsp() {
        return "login";
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcomeJsp(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if(authenticationService.authenticate(name, password)) {
            model.put("name", name);
//            model.put("password", password);
            return "Welcome";
        }
        model.put("errorMessage", "Invalid Credentials! Please try again");
        return "login";
    }
}