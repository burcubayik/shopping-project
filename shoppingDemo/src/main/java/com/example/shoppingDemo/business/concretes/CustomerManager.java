package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CustomerService;
import com.example.shoppingDemo.business.response.customers.GetAllCustomersResponse;
import com.example.shoppingDemo.business.response.customers.GetByCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.dataAccess.abstracts.CustomerRepository;
import com.example.shoppingDemo.entities.concretes.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;


    public CustomerManager(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;

    }


    @Override
    public DataResult<List<GetAllCustomersResponse>> getAll() {
        List<Customer> result =this.customerRepository.findAll();
        List<GetAllCustomersResponse> response = result.stream().map(customer -> GetAllCustomersResponse.builder()
                .customerId(customer.getCustomerId())
                .customerNumber(customer.getCustomerNumber())
                .build()).collect(Collectors.toList());
        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByCustomerResponse> getById(int customerId) {
        Customer result=this.customerRepository.findById(customerId).get();
        GetByCustomerResponse response=GetByCustomerResponse.builder()
                .customerId(result.getCustomerId())
                .build();
        return new SuccessDataResult<>(response);
    }
}
