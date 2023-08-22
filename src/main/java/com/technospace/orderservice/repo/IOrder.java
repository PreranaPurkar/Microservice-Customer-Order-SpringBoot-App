package com.technospace.orderservice.repo;


import com.technospace.orderservice.entity.OrdersE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrder extends JpaRepository<OrdersE,Integer> {
    @Query(nativeQuery = true,value="SELECT * from orderse where cid =:custid ")
    List<OrdersE> findOrdersByCid(@Param("custid") int custid);
}
