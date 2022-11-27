package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CountryService;
import com.example.shoppingDemo.business.request.countries.CreateCountryRequest;
import com.example.shoppingDemo.business.request.countries.DeleteCountryRequest;
import com.example.shoppingDemo.business.request.countries.UpdateCountryRequest;
import com.example.shoppingDemo.business.response.countries.GetAllCountriesResponse;
import com.example.shoppingDemo.business.response.countries.GetByCountryResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryManager implements CountryService {
    @Override
    public Result add(CreateCountryRequest createCountryRequest) {
        return null;
    }

    @Override
    public Result update(UpdateCountryRequest updateCountryRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteCountryRequest deleteCountryRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllCountriesResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetByCountryResponse> getById(int id) {
        return null;
    }
}
