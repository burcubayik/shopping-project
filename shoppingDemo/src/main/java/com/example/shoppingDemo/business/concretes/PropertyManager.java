package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.PropertyService;
import com.example.shoppingDemo.business.dtos.PropertyDto;
import com.example.shoppingDemo.business.mapper.PropertyMapper;
import com.example.shoppingDemo.dataAccess.abstracts.PropertyRepository;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyManager implements PropertyService {

   private PropertyRepository propertyRepository;

    @Autowired
    public PropertyManager( PropertyRepository propertyRepository) {

        this.propertyRepository = propertyRepository;
    }

    @Override
    public void add(PropertyDto propertyDto) {

    }

}
