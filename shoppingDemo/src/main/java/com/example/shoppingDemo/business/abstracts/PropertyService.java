package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.properties.CreatePropertyRequest;
import com.example.shoppingDemo.business.request.properties.DeletePropertyRequest;
import com.example.shoppingDemo.business.request.properties.UpdatePropertyRequest;
import com.example.shoppingDemo.business.response.properties.GetAllPropertyResponse;
import com.example.shoppingDemo.business.response.properties.GetByPropertyResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface PropertyService {
    Result add(CreatePropertyRequest createPropertyRequest);
    Result update (UpdatePropertyRequest updatePropertyRequest);
    Result delete(DeletePropertyRequest deletePropertyRequest);
    DataResult<List<GetAllPropertyResponse>> getAll();

    DataResult<GetByPropertyResponse> getById(int id);

//GETBYID


}
