package br.com.lucasespindula.petfast.service.impl;

import br.com.lucasespindula.petfast.converter.ProductConverter;
import br.com.lucasespindula.petfast.repository.ProductRepository;
import br.com.lucasespindula.petfast.service.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<ProductDTO> findAllProducts() {
        return productRepository.findAll().stream()
                .map(ProductConverter::productEntityToDto)
                .toList();
    }
}