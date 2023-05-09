package thymeleaf.Workshop.controller;


import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import thymeleaf.Workshop.model.Registration;

@Controller
@Slf4j
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration") Registration registration, HttpServletRequest request) {
        System.out.println(   registration.getPersonName());
        return "registration";
    }
}
