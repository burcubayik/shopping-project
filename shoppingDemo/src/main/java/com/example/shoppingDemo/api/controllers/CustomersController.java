package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.CustomerService;
import com.example.shoppingDemo.business.request.customers.CreateCustomerRequest;
import com.example.shoppingDemo.business.request.customers.DeleteCustomerRequest;
import com.example.shoppingDemo.business.request.customers.UpdateCustomerRequest;
import com.example.shoppingDemo.business.response.customers.GetAllCustomersResponse;
import com.example.shoppingDemo.business.response.customers.GetByCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    @Autowired
    CustomerService customerService;

    public CustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }



    @GetMapping("/getall")
    public DataResult<List<GetAllCustomersResponse>> getAll() {
        return this.customerService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByCustomerResponse> getById(@RequestParam int customerId) {
        return this.customerService.getById(customerId);
    }

}
