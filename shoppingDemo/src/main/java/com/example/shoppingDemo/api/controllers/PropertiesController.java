package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.PropertyService;
import com.example.shoppingDemo.business.request.property.CreatePropertyRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
