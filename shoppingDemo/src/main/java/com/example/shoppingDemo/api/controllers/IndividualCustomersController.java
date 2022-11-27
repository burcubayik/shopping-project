package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.IndividualCustomerService;
import com.example.shoppingDemo.business.request.individualCustomers.CreateIndividualCustomerRequest;
import com.example.shoppingDemo.business.request.individualCustomers.DeleteIndividualCustomerRequest;
import com.example.shoppingDemo.business.request.individualCustomers.UpdateIndividualCustomerRequest;
import com.example.shoppingDemo.business.response.individualCustomers.GetAllIndividualCustomersResponse;
import com.example.shoppingDemo.business.response.individualCustomers.GetByIndividualCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/individualCustomers")
public class IndividualCustomersController {

    @Autowired
    IndividualCustomerService individualCustomerService;

    public IndividualCustomersController(IndividualCustomerService individualCustomerService) {
        this.individualCustomerService = individualCustomerService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateIndividualCustomerRequest createIndividualCustomerRequest) {
        return this.individualCustomerService.add(createIndividualCustomerRequest);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
        return this.individualCustomerService.update(updateIndividualCustomerRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeleteIndividualCustomerRequest deleteIndividualCustomerRequest) {
        return this.individualCustomerService.delete(deleteIndividualCustomerRequest);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllIndividualCustomersResponse>> getAll() {
        return this.individualCustomerService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByIndividualCustomerResponse> getById(@RequestParam int individualCustomerId) {
        return this.individualCustomerService.getById(individualCustomerId);
    }
}
