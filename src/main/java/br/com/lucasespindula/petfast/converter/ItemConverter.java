package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Item;
import br.com.lucasespindula.petfast.service.dto.ItemDTO;

import static br.com.lucasespindula.petfast.converter.PetshopConverter.petshopDtoToEntity;
import static br.com.lucasespindula.petfast.converter.ProductConverter.productDtoToEntity;

public class ItemConverter {

    public static Item itemDtoToEntity(ItemDTO itemDTO) {
        return Item.builder()
                .amount(itemDTO.getAmount())
                .petshop(petshopDtoToEntity(itemDTO.getPetshopDTO()))
                .product(productDtoToEntity(itemDTO.getProductDTO()))
                .build();
    }
}
