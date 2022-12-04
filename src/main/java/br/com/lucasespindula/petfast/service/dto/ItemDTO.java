package br.com.lucasespindula.petfast.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

@Getter
@Component
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {

    @NotBlank
    private Integer amount;

    @NotBlank
    private ProductDTO productDTO;

    @NotBlank
    private PetshopDTO petshopDTO;
}