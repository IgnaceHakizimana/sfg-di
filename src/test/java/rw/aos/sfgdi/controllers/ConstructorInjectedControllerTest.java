package rw.aos.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rw.aos.sfgdi.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Ignace
 * @date : Thu, 7/9/2020
 **/
class ConstructorInjectedControllerTest {
ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}