package rw.aos.sfgdi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import rw.aos.sfgdi.services.GreetingService;

/**
 * @author : Ignace
 * @date : Thu, 7/9/2020
 **/
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
