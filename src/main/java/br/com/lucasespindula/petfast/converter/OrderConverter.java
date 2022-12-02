package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Order;
import br.com.lucasespindula.petfast.service.dto.OrderDTO;

import static br.com.lucasespindula.petfast.converter.ClientConverter.clientDtoToEntity;

public class OrderConverter {

    public static Order OrderDtoToEntity(OrderDTO orderDTO) {
        return Order.builder()
                .items(orderDTO.getItemsDTO().stream()
                        .map(ItemConverter::itemDtoToEntity)
                        .toList())
                .purchaseDate(orderDTO.getPurchaseDate())
                .client(clientDtoToEntity(orderDTO.getClientDTO()))
                .build();
    }
}
