package br.com.lucasespindula.petfast.controllers.impl;

import br.com.lucasespindula.petfast.service.dto.ItemDTO;
import br.com.lucasespindula.petfast.service.impl.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private void registerItem(@RequestBody ItemDTO itemDTO) {
        itemService.registerItem(itemDTO);
    }
}