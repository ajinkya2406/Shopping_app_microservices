package com.ajinkya.microservices.order.controller;


import com.ajinkya.microservices.order.dto.OrderRequest;
import com.ajinkya.microservices.order.service.Orderservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor

public class OrderController {

    private final Orderservice orderservice;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderservice.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
}
