package br.com.lucasespindula.petfast.service.impl;

import br.com.lucasespindula.petfast.repository.ProductRepository;
import br.com.lucasespindula.petfast.service.dto.ProductDTO;
import org.springframework.stereotype.Service;

import static br.com.lucasespindula.petfast.converter.ProductConverter.productDtoToEntity;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void registerProduct(ProductDTO productDTO) {
        productRepository.save(productDtoToEntity(productDTO));
    }
}