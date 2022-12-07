package com.example.shoppingDemo.entities.concretes;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder
@Table(name = "individual_customer")
@PrimaryKeyJoinColumn(name = "individual_customer_id", referencedColumnName = "customer_id")
@EqualsAndHashCode(callSuper = true)
public class IndividualCustomer extends Customer {
    @Column(name = "individual_customer_id", insertable = false, updatable = false)
    private int individualCustomerId;
    @Column(name = "nationality_id")
    private String nationalityId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birthdate")
    private Date birthDate;
    @Column(name = "gender")
    private String gender;//enum kullan



}
