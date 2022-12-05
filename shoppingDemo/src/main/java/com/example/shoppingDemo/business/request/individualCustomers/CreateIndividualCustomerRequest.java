package com.example.shoppingDemo.business.request.individualCustomers;


import com.example.shoppingDemo.business.request.customers.CreateCustomerRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateIndividualCustomerRequest {
    private CreateCustomerRequest createCustomerRequest;
    private String nationalityId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String gender; //enum

}
