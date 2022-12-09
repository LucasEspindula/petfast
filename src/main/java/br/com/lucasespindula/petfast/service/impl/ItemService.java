package br.com.lucasespindula.petfast.service.impl;

import br.com.lucasespindula.petfast.repository.ItemRepository;
import br.com.lucasespindula.petfast.repository.PetshopRepository;
import br.com.lucasespindula.petfast.repository.ProductRepository;
import br.com.lucasespindula.petfast.service.dto.ItemDTO;
import org.springframework.stereotype.Service;

import static br.com.lucasespindula.petfast.converter.ItemConverter.itemDtoToEntity;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    private final ProductRepository productRepository;

    private final PetshopRepository petshopRepository;

    public ItemService(ItemRepository itemRepository, ProductRepository productRepository, PetshopRepository petshopRepository) {
        this.itemRepository = itemRepository;
        this.productRepository = productRepository;
        this.petshopRepository = petshopRepository;
    }

    public void registerItem(ItemDTO itemDTO) {

//        itemRepository.save(itemDtoToEntity(itemDTO, this.productRepository, this.petshopRepository));
    }
}
