package rw.aos.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author : Ignace
 * @date : Sun, 7/12/2020
 **/

@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Spanish";
    }
}
