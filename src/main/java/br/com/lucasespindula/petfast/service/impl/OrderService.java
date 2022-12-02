package br.com.lucasespindula.petfast.service.impl;

import br.com.lucasespindula.petfast.repository.OrderRepository;
import br.com.lucasespindula.petfast.service.dto.OrderDTO;
import org.springframework.stereotype.Service;

import static br.com.lucasespindula.petfast.converter.OrderConverter.OrderDtoToEntity;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void registerOrder(OrderDTO orderDTO) {
        orderRepository.save(OrderDtoToEntity(orderDTO));
    }
}