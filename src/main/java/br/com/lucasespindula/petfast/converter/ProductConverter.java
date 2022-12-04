package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Product;
import br.com.lucasespindula.petfast.service.dto.ProductDTO;

public class ProductConverter {

    public static Product productDtoToEntity(ProductDTO productDTO) {
        return Product.builder()
                .name(productDTO.getName())
                .value(productDTO.getValue())
                .typeProduct(productDTO.getTypeProduct())
                .description(productDTO.getDescription())
                .build();
    }
}