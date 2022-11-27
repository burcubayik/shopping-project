package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.AddressService;
import com.example.shoppingDemo.business.request.addresses.CreateAddressRequest;
import com.example.shoppingDemo.business.request.addresses.DeleteAddressRequest;
import com.example.shoppingDemo.business.request.addresses.UpdateAddressRequest;
import com.example.shoppingDemo.business.response.addresses.GetAllAddressesResponse;
import com.example.shoppingDemo.business.response.addresses.GetByAddressResponse;
import com.example.shoppingDemo.business.response.addresses.GetByCustomerIdAddressResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/addresses")
public class AddressesController {
    @Autowired
    AddressService addressService;

    public AddressesController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateAddressRequest createAddressRequest) {
        return this.addressService.add(createAddressRequest);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateAddressRequest updateAddressRequest) {
        return this.addressService.update(updateAddressRequest);
    }
    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeleteAddressRequest deleteAddressRequest) {
        return this.addressService.delete(deleteAddressRequest);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllAddressesResponse>> getAll() {
        return this.addressService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByAddressResponse> getById(@RequestParam int id) {
        return this.addressService.getById(id);
    }

    @GetMapping("/getbycustomerid")
    public DataResult<GetByCustomerIdAddressResponse> getByCustomerId(@RequestParam int customerId) {
        return this.addressService.getByCustomerId(customerId);
    }
}
