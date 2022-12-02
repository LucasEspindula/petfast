package br.com.lucasespindula.petfast.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Component
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    @NotBlank
    private ClientDTO clientDTO;

    @NotBlank
    private LocalDateTime purchaseDate;

    @NotBlank
    private List<ItemDTO> itemsDTO;
}