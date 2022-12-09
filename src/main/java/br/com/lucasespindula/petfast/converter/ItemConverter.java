package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Item;
import br.com.lucasespindula.petfast.entities.Order;
import br.com.lucasespindula.petfast.repository.PetshopRepository;
import br.com.lucasespindula.petfast.repository.ProductRepository;
import br.com.lucasespindula.petfast.service.dto.ItemDTO;

public class ItemConverter {

    public static Item itemDtoToEntity(Order order, ItemDTO itemDTO, ProductRepository productRepository, PetshopRepository petshopRepository) {
        return Item.builder()
                .order(order)
                .amount(itemDTO.getAmount())
                .petshop(petshopRepository.getReferenceById(itemDTO.getPetshopId()))
                .product(productRepository.getReferenceById(itemDTO.getProductId()))
                .build();
    }
}