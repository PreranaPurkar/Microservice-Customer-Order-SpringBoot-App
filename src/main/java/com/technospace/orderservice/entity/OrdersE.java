package com.technospace.orderservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="OrdersE")
public class OrdersE {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int oid;
    private String date;
    private String item;
    private int amount;
    private int cid;

   // @ManyToOne
   // @JoinColumn(name="cid")
   // private CustomerE customerE;


}
