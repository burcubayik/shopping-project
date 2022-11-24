package com.example.shoppingDemo.business.request.individualCustomers;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateIndividualCustomerRequest {
    private int individualCustomerId;
    private String nationalityId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String gender; //enum
}
//email password rentacar ??
