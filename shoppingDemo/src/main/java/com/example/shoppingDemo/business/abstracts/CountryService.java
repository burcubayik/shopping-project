package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.countries.CreateCountryRequest;
import com.example.shoppingDemo.business.request.countries.DeleteCountryRequest;
import com.example.shoppingDemo.business.request.countries.UpdateCountryRequest;
import com.example.shoppingDemo.business.response.countries.GetAllCountriesResponse;
import com.example.shoppingDemo.business.response.countries.GetByCountryResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface CountryService {
    Result add(CreateCountryRequest createCountryRequest);
    Result update(UpdateCountryRequest updateCountryRequest);
    Result delete(DeleteCountryRequest deleteCountryRequest);
    DataResult<List<GetAllCountriesResponse>> getAll();
    DataResult<GetByCountryResponse> getById(int corporateCustomerId);
}
