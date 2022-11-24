package com.example.shoppingDemo.business.abstracts;

import com.example.shoppingDemo.business.request.addresses.CreateAddressRequest;
import com.example.shoppingDemo.business.request.addresses.DeleteAddressRequest;
import com.example.shoppingDemo.business.request.addresses.UpdateAddressRequest;
import com.example.shoppingDemo.business.response.addresses.GetAllAddressesResponse;
import com.example.shoppingDemo.business.response.addresses.GetByCustomerIdAddressResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface AddressService {
    Result add(CreateAddressRequest createAddressRequest);
    Result update(UpdateAddressRequest updateAddressRequest);
    Result delete(DeleteAddressRequest deleteAddressRequest);
    DataResult<List<GetAllAddressesResponse>> getAll();
    DataResult<GetByCustomerIdAddressResponse> getByCustomerId(int customerId);


}
