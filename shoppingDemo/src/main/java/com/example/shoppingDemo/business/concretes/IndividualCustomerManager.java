package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.IndividualCustomerService;
import com.example.shoppingDemo.business.request.individualCustomers.CreateIndividualCustomerRequest;
import com.example.shoppingDemo.business.request.individualCustomers.DeleteIndividualCustomerRequest;
import com.example.shoppingDemo.business.request.individualCustomers.UpdateIndividualCustomerRequest;
import com.example.shoppingDemo.business.response.individualCustomers.GetAllIndividualCustomersResponse;
import com.example.shoppingDemo.business.response.individualCustomers.GetByIndividualCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndividualCustomerManager implements IndividualCustomerService {
    @Override
    public Result add(CreateIndividualCustomerRequest createIndividualCustomerRequest) {
        return null;
    }

    @Override
    public Result update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteIndividualCustomerRequest deleteIndividualCustomerRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllIndividualCustomersResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetByIndividualCustomerResponse> getById(int individualCustomerId) {
        return null;
    }
}
