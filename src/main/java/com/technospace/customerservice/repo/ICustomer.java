package com.technospace.customerservice.repo;

import com.technospace.customerservice.entity.CustomerE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomer extends JpaRepository<CustomerE,Integer> {
}
