package rw.aos.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author : Ignace
 * @date : Wed, 7/1/2020
 **/

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World!!!!");
        return "Hi Folks!";
    }
}
