package br.com.lucasespindula.petfast.converter;

import br.com.lucasespindula.petfast.entities.Order;
import br.com.lucasespindula.petfast.repository.ClientRepository;
import br.com.lucasespindula.petfast.repository.OrderRepository;
import br.com.lucasespindula.petfast.repository.PetshopRepository;
import br.com.lucasespindula.petfast.repository.ProductRepository;
import br.com.lucasespindula.petfast.service.dto.OrderDTO;
import lombok.val;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static br.com.lucasespindula.petfast.converter.ClientConverter.clientDtoToEntity;
import static br.com.lucasespindula.petfast.converter.ItemConverter.itemDtoToEntity;

public class OrderConverter {

    public static Order orderDtoToEntity(OrderDTO orderDTO, ClientRepository clientRepository, PetshopRepository petshopRepository, ProductRepository productRepository) {

        var teste = Order.builder()
                .items(new ArrayList<>())
                .purchaseDate(LocalDateTime.now())
                .client(clientRepository.getReferenceById(orderDTO.getClientId()))
                .build();

        teste.getItems().addAll(orderDTO.getItemsDTO().stream()
                .map( e -> itemDtoToEntity(teste, e, productRepository, petshopRepository))
                .toList());

        return teste;
    }
}