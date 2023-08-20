package com.technospace.customerservice.controller;

import com.technospace.customerservice.entity.OrdersE;
import com.technospace.customerservice.repo.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/api")
public class OrderController {

    @Autowired
    IOrder iOrder;
@PostMapping("/addorders")
    public OrdersE addorders(@RequestBody OrdersE ordersE){
    return iOrder.save(ordersE);
}
}
