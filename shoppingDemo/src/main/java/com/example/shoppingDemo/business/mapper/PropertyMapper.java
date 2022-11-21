package com.example.shoppingDemo.business.mapper;

import com.example.shoppingDemo.business.dtos.PropertyDto;
import com.example.shoppingDemo.entities.concretes.Property;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PropertyMapper {


    PropertyMapper INSTANCE = Mappers.getMapper(PropertyMapper.class);
    //@Named("mapFromPropertyToPropertyDto")
   // @InheritInverseConfiguration
    Property modelTODto(Property property);
    //@Named("mapFromPropertyDtoToProperty")

    PropertyDto dtoTOModel(PropertyDto propertyDto);
}
