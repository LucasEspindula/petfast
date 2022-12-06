package br.com.lucasespindula.petfast.controllers.impl;

import br.com.lucasespindula.petfast.service.dto.ProductDTO;
import br.com.lucasespindula.petfast.service.impl.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registerProduct(@RequestBody ProductDTO productDTO) {
        productService.registerProduct(productDTO);
    }

    @GetMapping("/request")
    public ResponseEntity<List<ProductDTO>> findAllProducts() {
        return ResponseEntity.ok(productService.findAllProducts());
    }
}