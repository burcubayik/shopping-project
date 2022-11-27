package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CityService;
import com.example.shoppingDemo.business.request.cities.CreateCityRequest;
import com.example.shoppingDemo.business.request.cities.DeleteCityRequest;
import com.example.shoppingDemo.business.request.cities.UpdateCityRequest;
import com.example.shoppingDemo.business.response.cities.GetAllCitiesResponse;
import com.example.shoppingDemo.business.response.cities.GetByCityResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.dataAccess.abstracts.CityRepository;
import com.example.shoppingDemo.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityManager implements CityService {

    @Autowired
    CityRepository cityRepository;

    public CityManager(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    //dışardan şehir giriliyor..

    @Override
    public DataResult<List<GetAllCitiesResponse>> getAll() {
        List<City> result=this.cityRepository.findAll();
        List<GetAllCitiesResponse> response=result.stream().map(city -> GetAllCitiesResponse.builder()
                .id(city.getId()).name(city.getName())
                        .countryId(city.getCountry().getId())
                        .countryName(city.getCountry().getName())
                .build())
        .collect(Collectors.toList());

        return  new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByCityResponse> getById(int id) {
        City result=this.cityRepository.findById(id).get();
        GetByCityResponse response=GetByCityResponse.builder()
                .name(result.getName())
                .countryName(result.getCountry().getName())
                .build();
        return new SuccessDataResult<>(response);
    }
}
