package com.example.shoppingDemo.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "customer_id", referencedColumnName = "id")
public class Customer extends User{
    @Column(name = "customer_id", insertable = false, updatable = false)
    private int customerId;
    @Column(name = "customer_number")
    private String customerNumber;
    @OneToMany(mappedBy = "customer")
    private List<Cart> carts;

}
