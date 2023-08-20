package com.technospace.customerservice.controller;

import com.technospace.customerservice.entity.CustomerE;
import com.technospace.customerservice.repo.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/api")
public class CustomerController {
    @Autowired
    ICustomer iCustomer;
    @PostMapping("/addcustomer")
    public CustomerE addcustomer(@RequestBody CustomerE customerE){
        return iCustomer.save(customerE);
    }
    @GetMapping("/getallcustomers")
    public List<CustomerE> getallcustomers(){
        return iCustomer.findAll();
    }
}
