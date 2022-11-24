package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.individualCustomers.CreateIndividualCustomerRequest;
import com.example.shoppingDemo.business.request.individualCustomers.DeleteIndividualCustomerRequest;
import com.example.shoppingDemo.business.request.individualCustomers.UpdateIndividualCustomerRequest;
import com.example.shoppingDemo.business.response.individualCustomers.GetAllIndividualCustomersResponse;
import com.example.shoppingDemo.business.response.individualCustomers.GetByIndividualCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface IndividualCustomerService {

    Result add(CreateIndividualCustomerRequest createIndividualCustomerRequest);
    Result update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest);
    Result delete(DeleteIndividualCustomerRequest deleteIndividualCustomerRequest);
    DataResult<List<GetAllIndividualCustomersResponse>> getAll();
    DataResult<GetByIndividualCustomerResponse> getById(int individualCustomerId);
}
