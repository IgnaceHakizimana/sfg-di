package rw.aos.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author : Ignace
 * @date : Sun, 7/12/2020
 **/
@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
