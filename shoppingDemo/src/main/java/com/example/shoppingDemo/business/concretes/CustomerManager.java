package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CustomerService;
import com.example.shoppingDemo.business.request.customers.CreateCustomerRequest;
import com.example.shoppingDemo.business.request.customers.DeleteCustomerRequest;
import com.example.shoppingDemo.business.request.customers.UpdateCustomerRequest;
import com.example.shoppingDemo.business.response.customers.GetAllCustomersResponse;
import com.example.shoppingDemo.business.response.customers.GetByCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerManager implements CustomerService {
    @Override
    public Result add(CreateCustomerRequest createCustomerRequest) {
        return null;
    }

    @Override
    public Result update(UpdateCustomerRequest updateCustomerRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteCustomerRequest deleteCustomerRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllCustomersResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetByCustomerResponse> getById(int customerId) {
        return null;
    }
}
