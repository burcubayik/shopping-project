package com.example.shoppingDemo.api.controllers;


import com.example.shoppingDemo.business.abstracts.CityService;
import com.example.shoppingDemo.business.request.cities.CreateCityRequest;
import com.example.shoppingDemo.business.request.cities.DeleteCityRequest;
import com.example.shoppingDemo.business.request.cities.UpdateCityRequest;
import com.example.shoppingDemo.business.response.cities.GetAllCitiesResponse;
import com.example.shoppingDemo.business.response.cities.GetByCityResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
    @Autowired
    CityService cityService;

    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }



    @GetMapping("/getall")
    public DataResult<List<GetAllCitiesResponse>> getAll() {
        return this.cityService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByCityResponse> getById(@RequestParam int id) {
        return this.cityService.getById(id);
    }
}
