package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.AddressService;
import com.example.shoppingDemo.business.request.addresses.CreateAddressRequest;
import com.example.shoppingDemo.business.request.addresses.DeleteAddressRequest;
import com.example.shoppingDemo.business.request.addresses.UpdateAddressRequest;
import com.example.shoppingDemo.business.response.addresses.GetAllAddressesResponse;
import com.example.shoppingDemo.business.response.addresses.GetByAddressResponse;
import com.example.shoppingDemo.business.response.addresses.GetByCustomerIdAddressResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.dataAccess.abstracts.AddressRepository;
import com.example.shoppingDemo.entities.concretes.Address;
import com.example.shoppingDemo.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressManager implements AddressService {
    private AddressRepository addressRepository;

    @Autowired
    public AddressManager(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Result add(CreateAddressRequest createAddressRequest) {
        return null;
    }

    @Override
    public Result update(UpdateAddressRequest updateAddressRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteAddressRequest deleteAddressRequest) {
        return null;
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

