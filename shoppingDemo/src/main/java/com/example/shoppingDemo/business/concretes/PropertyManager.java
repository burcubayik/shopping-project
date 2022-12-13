package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.PropertyService;
import com.example.shoppingDemo.business.request.properties.CreatePropertyRequest;
import com.example.shoppingDemo.business.request.properties.DeletePropertyRequest;
import com.example.shoppingDemo.business.request.properties.UpdatePropertyRequest;
import com.example.shoppingDemo.business.response.categories.GetByCategoryResponse;
import com.example.shoppingDemo.business.response.properties.GetAllPropertyResponse;
import com.example.shoppingDemo.business.response.properties.GetByPropertyResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.core.utilities.results.SuccessResult;
import com.example.shoppingDemo.dataAccess.abstracts.PropertyRepository;
import com.example.shoppingDemo.entities.concretes.Property;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PropertyManager implements PropertyService {

   private PropertyRepository propertyRepository;

    @Autowired
    public PropertyManager( PropertyRepository propertyRepository) {

        this.propertyRepository = propertyRepository;
    }


    @Override
    public Result add(CreatePropertyRequest createPropertyRequest) {
       Property result= Property.builder()
                .name(createPropertyRequest.getName())
                .detail(createPropertyRequest.getDetail())
                .build();
        this.propertyRepository.save(result);
        return new SuccessResult("Added Property");
    }

    @Override
    public Result update(UpdatePropertyRequest updatePropertyRequest) {
        Property property=this.propertyRepository.findById(updatePropertyRequest.getId()).get();
        property.setName(updatePropertyRequest.getName());
        property.setDetail(updatePropertyRequest.getDetail());
        this.propertyRepository.save(property);
        return new SuccessResult("UPDATED.PROPERTY");
    }

    @Override
    public Result delete(DeletePropertyRequest deletePropertyRequest) {
        Property property = this.propertyRepository.findById(deletePropertyRequest.getId()).get();
        this.propertyRepository.delete(property);
        return new SuccessResult("DELETED.PROPERTY");
    }

    @Override
    public DataResult<List<GetAllPropertyResponse>> getAll() {
        List<Property> result = this.propertyRepository.findAll();
        List<GetAllPropertyResponse> response = result.stream().map(property -> GetAllPropertyResponse.builder()
                .name(property.getName())
                .detail(property.getDetail())
                .build()).collect(Collectors.toList());
        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByPropertyResponse> getById(int id) {
        Property result = this.propertyRepository.findById(id).get();
        GetByPropertyResponse response = GetByPropertyResponse.builder()
                .name(result.getName())
                .detail(result.getDetail())
                .build();
        return new SuccessDataResult<>(response);
    }
}
