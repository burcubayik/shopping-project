package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.AddressService;
import com.example.shoppingDemo.business.request.address.CreateAddressRequest;
import com.example.shoppingDemo.business.request.address.DeleteAddressRequest;
import com.example.shoppingDemo.business.request.address.UpdateAddressRequest;
import com.example.shoppingDemo.business.response.address.GetAllAddressesResponse;
import com.example.shoppingDemo.business.response.address.GetByCustomerIdAddressResponse;
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
