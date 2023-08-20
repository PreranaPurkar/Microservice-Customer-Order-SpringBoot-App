package com.technospace.customerservice.repo;

import com.technospace.customerservice.entity.OrdersE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrder extends JpaRepository<OrdersE,Integer> {
}
