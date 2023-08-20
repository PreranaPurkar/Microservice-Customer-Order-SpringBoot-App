package com.technospace.customerservice.controller;

import com.technospace.customerservice.entity.OrdersE;
import com.technospace.customerservice.repo.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order/api")
public class OrderController {

    @Autowired
    IOrder iOrder;

    @PostMapping("/addorders")
    public OrdersE addorders(@RequestBody OrdersE ordersE){
     return iOrder.save(ordersE);
}
    @GetMapping("/getorderbyoid/{oid}")
    public OrdersE getorderbyoid(@PathVariable ("oid") int oid){
        return iOrder.findById(oid).get();
    }
    @GetMapping("/getordersbycid/{custid}")
    public List<OrdersE> getordersbycid(@PathVariable("custid") int custid){
        return iOrder.findOrdersByCid(custid);
    }
}
