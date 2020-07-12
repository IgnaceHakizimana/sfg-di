package rw.aos.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rw.aos.sfgdi.services.ConstructorGreetingService;

/**
 * @author : Ignace
 * @date : Thu, 7/9/2020
 **/
class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller= new PropertyInjectedController();
        controller.greetingService=new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}