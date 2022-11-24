package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.properties.CreatePropertyRequest;
import com.example.shoppingDemo.business.request.properties.DeletePropertyRequest;
import com.example.shoppingDemo.business.request.properties.UpdatePropertyRequest;
import com.example.shoppingDemo.business.response.properties.GetAllPropertyResponse;

import java.util.List;

public interface PropertyService {
    void add(CreatePropertyRequest createPropertyRequest);
    void update (UpdatePropertyRequest updatePropertyRequest);
    void delete(DeletePropertyRequest deletePropertyRequest);

    List<GetAllPropertyResponse> getAll();

//GETBYID


}
