package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.SupplierService;
import com.example.shoppingDemo.business.request.suppliers.CreateSupplierRequest;
import com.example.shoppingDemo.business.request.suppliers.DeleteSupplierRequest;
import com.example.shoppingDemo.business.request.suppliers.UpdateSupplierRequest;
import com.example.shoppingDemo.business.response.suppliers.GetAllSuppliersResponse;
import com.example.shoppingDemo.business.response.suppliers.GetBySupplierResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suppliers")
public class SuppliersController {

    SupplierService supplierService;

    public SuppliersController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateSupplierRequest createSupplierRequest) {
        return this.supplierService.add(createSupplierRequest);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateSupplierRequest updateSupplierRequest) {
        return this.supplierService.update(updateSupplierRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeleteSupplierRequest deleteSupplierRequest) {
        return this.supplierService.delete(deleteSupplierRequest);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllSuppliersResponse>> getAll() {
        return this.supplierService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetBySupplierResponse> getById(@RequestParam int id) {
        return this.supplierService.getById(id);
    }
}
