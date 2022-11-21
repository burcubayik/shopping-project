package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.PropertyService;
import com.example.shoppingDemo.business.dtos.PropertyDto;
import com.example.shoppingDemo.business.mapper.PropertyMapper;
import com.example.shoppingDemo.dataAccess.abstracts.PropertyRepository;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j//bu ne?
@Service
public class PropertyManager implements PropertyService {

   private final PropertyMapper propertyMapper;
   private final PropertyRepository propertyRepository;

    @Autowired
    public PropertyManager(PropertyMapper propertyMapper, PropertyRepository propertyRepository) {
        this.propertyMapper = propertyMapper;
        this.propertyRepository = propertyRepository;
    }

    @Override
    public void add(PropertyDto propertyDto) {

    }
}
