package com.technospace.customerservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Customer")
public class CustomerE {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String cname;
    private String phoneno;
    @OneToMany(cascade = CascadeType.ALL)
    public List<OrdersE> ordersEList;

}
