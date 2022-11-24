package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.PropertyService;
import com.example.shoppingDemo.business.request.properties.CreatePropertyRequest;
import com.example.shoppingDemo.business.request.properties.DeletePropertyRequest;
import com.example.shoppingDemo.business.request.properties.UpdatePropertyRequest;
import com.example.shoppingDemo.business.response.properties.GetAllPropertyResponse;
import com.example.shoppingDemo.dataAccess.abstracts.PropertyRepository;
import com.example.shoppingDemo.entities.concretes.Property;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public void update(UpdatePropertyRequest updatePropertyRequest) {

    }

    @Override
    public void delete(DeletePropertyRequest deletePropertyRequest) {

    }

    @Override
    public List<GetAllPropertyResponse> getAll() {
        return null;
    }

}
