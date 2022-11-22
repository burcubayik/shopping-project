package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.PropertyService;
import com.example.shoppingDemo.business.request.property.CreatePropertyRequest;
import com.example.shoppingDemo.dataAccess.abstracts.PropertyRepository;
import com.example.shoppingDemo.entities.concretes.Property;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyManager implements PropertyService {

   private PropertyRepository propertyRepository;

    @Autowired
    public PropertyManager( PropertyRepository propertyRepository) {

        this.propertyRepository = propertyRepository;
    }

    @Override
    public void add(CreatePropertyRequest createPropertyRequest) {
        Property result= Property.builder()
                .name(createPropertyRequest.getName())
                .detail(createPropertyRequest.getDetail())
                .build();
        this.propertyRepository.save(result);

    }

}
