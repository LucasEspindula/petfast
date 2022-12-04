package br.com.lucasespindula.petfast.controllers.impl;

import br.com.lucasespindula.petfast.service.dto.OrderDTO;
import br.com.lucasespindula.petfast.service.impl.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registerClient(@RequestBody OrderDTO orderDTO) {
        orderService.registerOrder(orderDTO);
    }
}