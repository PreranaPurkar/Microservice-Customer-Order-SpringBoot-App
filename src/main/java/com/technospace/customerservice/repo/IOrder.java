package com.technospace.customerservice.repo;

import com.technospace.customerservice.entity.OrdersE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrder extends JpaRepository<OrdersE,Integer> {
}
