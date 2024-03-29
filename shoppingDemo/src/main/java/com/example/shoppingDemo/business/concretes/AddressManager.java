package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.AddressService;
import com.example.shoppingDemo.business.abstracts.StateService;
import com.example.shoppingDemo.business.request.addresses.CreateAddressRequest;
import com.example.shoppingDemo.business.request.addresses.DeleteAddressRequest;
import com.example.shoppingDemo.business.request.addresses.UpdateAddressRequest;
import com.example.shoppingDemo.business.response.addresses.GetAllAddressesResponse;
import com.example.shoppingDemo.business.response.addresses.GetByAddressResponse;
import com.example.shoppingDemo.business.response.addresses.GetByCustomerIdAddressResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.core.utilities.results.SuccessResult;
import com.example.shoppingDemo.dataAccess.abstracts.AddressRepository;
import com.example.shoppingDemo.entities.concretes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressManager implements AddressService {
    private AddressRepository addressRepository;

    private StateService stateService;

    @Autowired
    public AddressManager(AddressRepository addressRepository,StateService stateService) {
        this.addressRepository = addressRepository;
        this.stateService=stateService;
    }

    @Override
    public Result add(CreateAddressRequest createAddressRequest) {
        State state=this.stateService.getState(1);
        User user=this.addressRepository.getByUserId(createAddressRequest.getUserId());
        City city=this.addressRepository.getByCity_Id(createAddressRequest.getCityId());

        Address address=Address.builder()
                .detail(createAddressRequest.getDetail())
                .user(user)
                .city(city)
                .state(state)
                        .build();
                this.addressRepository.save(address);

        return new SuccessResult("ADDRESS.ADDED");
    }

    @Override
    public Result update(UpdateAddressRequest updateAddressRequest) {

        City city=this.addressRepository.getByCity_Id(updateAddressRequest.getCityId());
        Address address=this.addressRepository.findById(updateAddressRequest.getId()).get();
        address.setCity(city);
        this.addressRepository.save(address);

        return new SuccessResult("UPDATED.ADDRESS");
    }

    @Override
    public Result delete(DeleteAddressRequest deleteAddressRequest) {
        State state=this.stateService.getState(2);
        Address address=this.addressRepository.findById(deleteAddressRequest.getId()).get();
        address.setState(state);
        this.addressRepository.delete(address);

        return new SuccessResult("DELETED.ADDRESS");
    }

    @Override
    public DataResult<List<GetAllAddressesResponse>> getAll() {
        //sorgu yazılafcak customer
        List<Address> result=this.addressRepository.findAll();


        return null;
    }

    @Override
    public DataResult<GetByAddressResponse> getById(int id) {
        Address result=this.addressRepository.findById(id).get();
        GetByAddressResponse response=GetByAddressResponse.builder()
        .id(result.getId())
                .build();
        return  new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByCustomerIdAddressResponse> getByCustomerId(int customerId) {
        return null;
    }
}

