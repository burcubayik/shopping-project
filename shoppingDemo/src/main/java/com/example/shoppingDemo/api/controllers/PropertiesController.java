package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.PropertyService;
import com.example.shoppingDemo.business.request.properties.CreatePropertyRequest;
import com.example.shoppingDemo.business.request.properties.DeletePropertyRequest;
import com.example.shoppingDemo.business.request.properties.UpdatePropertyRequest;
import com.example.shoppingDemo.business.response.properties.GetAllPropertyResponse;
import com.example.shoppingDemo.business.response.properties.GetByPropertyResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertiesController {
    private PropertyService propertyService;
    @Autowired
    public PropertiesController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }
    @PostMapping("/add")
    public void add(@RequestBody CreatePropertyRequest createPropertyRequest){
        this.propertyService.add(createPropertyRequest);
    }
    @PutMapping("/update")
    public Result update(@RequestBody UpdatePropertyRequest updatePropertyRequest) {
        return this.propertyService.update(updatePropertyRequest);
    }
    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeletePropertyRequest deletePropertyRequest) {
        return this.propertyService.delete(deletePropertyRequest);
    }
    @GetMapping("/getall")
    public DataResult<List<GetAllPropertyResponse>> getAll() {
        return this.propertyService.getAll();
    }
    @GetMapping("/getbyid")
    public DataResult<GetByPropertyResponse> getById(@RequestParam int id) {
        return this.propertyService.getById(id);
    }
}
