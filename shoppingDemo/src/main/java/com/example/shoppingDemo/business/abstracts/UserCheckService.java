package com.example.shoppingDemo.business.abstracts;

import com.example.shoppingDemo.business.request.individualCustomers.CreateIndividualCustomerRequest;
import com.example.shoppingDemo.entities.concretes.IndividualCustomer;

public interface UserCheckService {
    boolean checkIfRealPerson(CreateIndividualCustomerRequest createIndividualCustomerRequest);
}
