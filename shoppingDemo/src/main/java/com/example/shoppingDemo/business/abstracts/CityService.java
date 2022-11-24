package com.example.shoppingDemo.business.abstracts;

import com.example.shoppingDemo.business.request.cities.CreateCityRequest;
import com.example.shoppingDemo.business.request.cities.DeleteCityRequest;
import com.example.shoppingDemo.business.request.cities.UpdateCityRequest;
import com.example.shoppingDemo.business.response.cities.GetAllCitiesResponse;
import com.example.shoppingDemo.business.response.cities.GetByCityResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface CityService {

    Result add(CreateCityRequest createCityRequest);
    Result update(UpdateCityRequest updateCityRequest);
    Result delete(DeleteCityRequest deleteCityRequest);
    DataResult<List<GetAllCitiesResponse>> getAll();
    DataResult<GetByCityResponse> getById(int id);
}
