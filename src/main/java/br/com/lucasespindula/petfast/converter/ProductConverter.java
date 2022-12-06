package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Product;
import br.com.lucasespindula.petfast.service.dto.ProductDTO;

import java.time.LocalDateTime;

public class ProductConverter {

    public static Product productDtoToEntity(ProductDTO productDTO) {
        return Product.builder()
                .name(productDTO.getName())
                .value(productDTO.getValue())
                .typeProduct(productDTO.getTypeProduct())
                .description(productDTO.getDescription())
                .creationDate(LocalDateTime.now())
                .build();
    }

    public static ProductDTO productEntityToDto(Product product) {
        return ProductDTO.builder()
                .name(product.getName())
                .value(product.getValue())
                .typeProduct(product.getTypeProduct())
                .description(product.getDescription())
                .build();
    }
}