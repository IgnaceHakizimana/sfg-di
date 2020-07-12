package rw.aos.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import rw.aos.sfgdi.services.PetService;

/**
 * @author : Ignace
 * @date : Sun, 7/12/2020
 **/
@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
