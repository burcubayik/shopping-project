package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.CorporateCustomerService;
import com.example.shoppingDemo.business.request.corporateCustomers.CreateCorporateCustomerRequest;
import com.example.shoppingDemo.business.request.corporateCustomers.DeleteCorporateCustomerResquest;
import com.example.shoppingDemo.business.request.corporateCustomers.UpdateCorporateCustomerRequest;
import com.example.shoppingDemo.business.response.corporateCustomers.GetAllCorporateCustomersResponse;
import com.example.shoppingDemo.business.response.corporateCustomers.GetByCorporateCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/corporateCustomers")
public class CorporateCustomersController {
    @Autowired
    CorporateCustomerService corporateCustomerService;

    public CorporateCustomersController(CorporateCustomerService corporateCustomerService) {
        this.corporateCustomerService = corporateCustomerService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateCorporateCustomerRequest createCorporateCustomerRequest) {
        return this.corporateCustomerService.add(createCorporateCustomerRequest);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateCorporateCustomerRequest updateCorporateCustomerRequest) {
        return this.corporateCustomerService.update(updateCorporateCustomerRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeleteCorporateCustomerResquest deleteCorporateCustomerResquest) {
        return this.corporateCustomerService.delete(deleteCorporateCustomerResquest);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllCorporateCustomersResponse>> getAll() {
        return this.corporateCustomerService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByCorporateCustomerResponse> getById(@RequestParam int corporateCustomerId) {
        return this.corporateCustomerService.getById(corporateCustomerId);
    }
}
