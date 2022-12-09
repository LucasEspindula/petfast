package br.com.lucasespindula.petfast.service.impl;

import br.com.lucasespindula.petfast.repository.ClientRepository;
import br.com.lucasespindula.petfast.repository.OrderRepository;
import br.com.lucasespindula.petfast.repository.PetshopRepository;
import br.com.lucasespindula.petfast.repository.ProductRepository;
import br.com.lucasespindula.petfast.service.dto.OrderDTO;
import org.springframework.stereotype.Service;

import static br.com.lucasespindula.petfast.converter.OrderConverter.orderDtoToEntity;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    private final ClientRepository clientRepository;

    private final PetshopRepository petshopRepository;

    private final ProductRepository productRepository;

    public OrderService(OrderRepository orderRepository, ClientRepository clientRepository, PetshopRepository petshopRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.clientRepository = clientRepository;
        this.petshopRepository = petshopRepository;
        this.productRepository = productRepository;
    }

    public void registerOrder(OrderDTO orderDTO) {
        orderRepository.save(orderDtoToEntity(orderDTO, this.clientRepository, this.petshopRepository, this.productRepository));
    }
}