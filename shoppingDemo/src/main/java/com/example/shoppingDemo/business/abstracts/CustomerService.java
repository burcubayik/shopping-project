package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.customers.CreateCustomerRequest;
import com.example.shoppingDemo.business.request.customers.DeleteCustomerRequest;
import com.example.shoppingDemo.business.request.customers.UpdateCustomerRequest;
import com.example.shoppingDemo.business.response.customers.GetAllCustomersResponse;
import com.example.shoppingDemo.business.response.customers.GetByCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface CustomerService {

    Result add(CreateCustomerRequest createCustomerRequest);
    Result update(UpdateCustomerRequest updateCustomerRequest);
    Result delete(DeleteCustomerRequest deleteCustomerRequest);
    DataResult<List<GetAllCustomersResponse>> getAll();
    DataResult<GetByCustomerResponse> getById(int customerId);
}
