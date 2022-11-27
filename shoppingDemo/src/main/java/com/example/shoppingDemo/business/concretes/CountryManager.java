package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CountryService;
import com.example.shoppingDemo.business.request.countries.CreateCountryRequest;
import com.example.shoppingDemo.business.request.countries.DeleteCountryRequest;
import com.example.shoppingDemo.business.request.countries.UpdateCountryRequest;
import com.example.shoppingDemo.business.response.countries.GetAllCountriesResponse;
import com.example.shoppingDemo.business.response.countries.GetByCountryResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.dataAccess.abstracts.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryManager implements CountryService {
   CountryRepository countryRepository;
    @Autowired
    public CountryManager(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
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
