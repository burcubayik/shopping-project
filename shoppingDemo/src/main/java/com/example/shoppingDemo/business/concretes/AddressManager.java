package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.AddressService;
import com.example.shoppingDemo.business.request.addresses.CreateAddressRequest;
import com.example.shoppingDemo.business.request.addresses.DeleteAddressRequest;
import com.example.shoppingDemo.business.request.addresses.UpdateAddressRequest;
import com.example.shoppingDemo.business.response.addresses.GetAllAddressesResponse;
import com.example.shoppingDemo.business.response.addresses.GetByCustomerIdAddressResponse;
import com.example.shoppingDemo.dataAccess.abstracts.AddressRepository;
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
    public void add(CreateAddressRequest createAddressRequest) {

    }

    @Override
    public void update(UpdateAddressRequest updateAddressRequest) {

    }

    @Override
    public void delete(DeleteAddressRequest deleteAddressRequest) {

    }

    @Override
    public List<GetByCustomerIdAddressResponse> getByCustomerId(int customerId) {
        return null;
    }

    @Override
    public List<GetAllAddressesResponse> getAll() {
        return null;
    }
}
