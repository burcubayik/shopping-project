package com.example.shoppingDemo.business.abstracts;

import com.example.shoppingDemo.business.request.address.CreateAddressRequest;
import com.example.shoppingDemo.business.request.address.DeleteAddressRequest;
import com.example.shoppingDemo.business.request.address.UpdateAddressRequest;
import com.example.shoppingDemo.business.response.address.GetAllAddressesResponse;
import com.example.shoppingDemo.business.response.address.GetByCustomerIdAddressResponse;

import java.util.List;

public interface AddressService {
    void add(CreateAddressRequest createAddressRequest);
    void update(UpdateAddressRequest updateAddressRequest);
    void delete(DeleteAddressRequest deleteAddressRequest);
    List<GetByCustomerIdAddressResponse> getByCustomerId(int customerId);
    List<GetAllAddressesResponse> getAll();

}
