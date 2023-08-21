package com.technospace.customerservice.controller;

import com.technospace.customerservice.entity.CustomerE;
import com.technospace.customerservice.entity.OrdersE;
import com.technospace.customerservice.repo.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/customer/api")
public class CustomerController {
    @Autowired
    ICustomer iCustomer;

    @Autowired
    RestTemplate restTemplate;
    @PostMapping("/addcustomer")
    public CustomerE addcustomer(@RequestBody CustomerE customerE){
        return iCustomer.save(customerE);
    }

    @GetMapping("/getallcustomers")
    public List<CustomerE> getallcustomers(){
        return iCustomer.findAll();
    }

    @GetMapping("/getcustomerbycid/{cid}")
    public CustomerE getcustomerbycid(@PathVariable("cid") int cid){
        CustomerE customerE = iCustomer.findById(cid).get();
        List<OrdersE> ordersEList = restTemplate.getForObject("http://localhost:8003/order/api/getordersbycid/"+cid,List.class);
        customerE.setOrdersEList(ordersEList);
        return customerE;
    }
}
