package com.example.shoppingDemo.business.abstracts;

import com.example.shoppingDemo.entities.concretes.IndividualCustomer;

public interface UserCheckService {
    boolean checkIfRealPerson(IndividualCustomer individualCustomer);
}
