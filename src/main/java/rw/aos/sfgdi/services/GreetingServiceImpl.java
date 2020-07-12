package rw.aos.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author : Ignace
 * @date : Thu, 7/9/2020
 **/
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
