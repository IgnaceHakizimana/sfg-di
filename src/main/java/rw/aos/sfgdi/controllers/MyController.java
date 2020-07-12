package rw.aos.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import rw.aos.sfgdi.services.GreetingService;

/**
 * @author : Ignace
 * @date : Wed, 7/1/2020
 **/

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
