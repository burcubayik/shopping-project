package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CountryService;
import com.example.shoppingDemo.business.request.countries.CreateCountryRequest;
import com.example.shoppingDemo.business.request.countries.DeleteCountryRequest;
import com.example.shoppingDemo.business.request.countries.UpdateCountryRequest;
import com.example.shoppingDemo.business.response.countries.GetAllCountriesResponse;
import com.example.shoppingDemo.business.response.countries.GetByCountryResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.dataAccess.abstracts.CountryRepository;
import com.example.shoppingDemo.entities.concretes.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryManager implements CountryService {
   CountryRepository countryRepository;
    @Autowired
    public CountryManager(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    //ÜLKE DIŞARDAN EKLENİYOR.
    @Override
    public DataResult<List<GetAllCountriesResponse>> getAll() {
        List<Country> result = this.countryRepository.findAll();
        List<GetAllCountriesResponse> response = result.stream().map(country -> GetAllCountriesResponse.builder()
                .name(country.getName())
                .build()).collect(Collectors.toList());

        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByCountryResponse> getById(int id) {
        Country result = this.countryRepository.findById(id).get();
        GetByCountryResponse response = GetByCountryResponse.builder()
                .name(result.getName())
                .build();
        return new SuccessDataResult<>(response);
    }
}
