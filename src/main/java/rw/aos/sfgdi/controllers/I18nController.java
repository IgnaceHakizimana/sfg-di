package rw.aos.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import rw.aos.sfgdi.services.GreetingService;

/**
 * @author : Ignace
 * @date : Sun, 7/12/2020
 **/
@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello(){
        return greetingService.sayGreeting();
    }
}
