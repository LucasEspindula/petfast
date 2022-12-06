package br.com.lucasespindula.petfast.service.dto;

import br.com.lucasespindula.petfast.entities.TypeProduct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private Double value;

    @NotBlank
    private TypeProduct typeProduct;
}