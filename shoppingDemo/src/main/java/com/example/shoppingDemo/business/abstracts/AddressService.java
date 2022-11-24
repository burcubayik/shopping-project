package com.example.shoppingDemo.business.abstracts;

import com.example.shoppingDemo.business.request.addresses.CreateAddressRequest;
import com.example.shoppingDemo.business.request.addresses.DeleteAddressRequest;
import com.example.shoppingDemo.business.request.addresses.UpdateAddressRequest;
import com.example.shoppingDemo.business.response.addresses.GetAllAddressesResponse;
import com.example.shoppingDemo.business.response.addresses.GetByCustomerIdAddressResponse;

import java.util.List;

public interface AddressService {
    void add(CreateAddressRequest createAddressRequest);
    void update(UpdateAddressRequest updateAddressRequest);
    void delete(DeleteAddressRequest deleteAddressRequest);
    List<GetByCustomerIdAddressResponse> getByCustomerId(int customerId);
    List<GetAllAddressesResponse> getAll();

}
