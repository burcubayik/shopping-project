package com.example.shoppingDemo.business.response.individualCustomers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllIndividualCustomersResponse {
    private int individualCustomerId;
    private String nationalityId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String gender; //enum
}
