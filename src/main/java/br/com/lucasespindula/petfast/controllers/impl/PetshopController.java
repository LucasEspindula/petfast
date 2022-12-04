package br.com.lucasespindula.petfast.controllers.impl;

import br.com.lucasespindula.petfast.service.dto.PetshopDTO;
import br.com.lucasespindula.petfast.service.impl.PetshopService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/petshop")
public class PetshopController {

    private final PetshopService petshopService;

    public PetshopController(PetshopService petshopService) {
        this.petshopService = petshopService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registerPetshop(@RequestBody PetshopDTO petshopDTO) {
        petshopService.registerUserPetshop(petshopDTO);
    }
}