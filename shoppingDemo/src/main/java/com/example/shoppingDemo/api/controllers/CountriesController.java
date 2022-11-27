package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.CountryService;
import com.example.shoppingDemo.business.request.countries.CreateCountryRequest;
import com.example.shoppingDemo.business.request.countries.DeleteCountryRequest;
import com.example.shoppingDemo.business.request.countries.UpdateCountryRequest;
import com.example.shoppingDemo.business.response.countries.GetAllCountriesResponse;
import com.example.shoppingDemo.business.response.countries.GetByCountryResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountriesController {

    @Autowired
    CountryService countryService;

    public CountriesController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllCountriesResponse>> getAll() {
        return this.countryService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByCountryResponse> getById(@RequestParam int id) {
        return this.countryService.getById(id);
    }
}
