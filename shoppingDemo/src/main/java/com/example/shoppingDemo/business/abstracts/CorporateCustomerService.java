package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.corporateCustomers.CreateCorporateCustomerRequest;
import com.example.shoppingDemo.business.request.corporateCustomers.DeleteCorporateCustomerResquest;
import com.example.shoppingDemo.business.request.corporateCustomers.UpdateCorporateCustomerRequest;
import com.example.shoppingDemo.business.response.corporateCustomers.GetAllCorporateCustomersResponse;
import com.example.shoppingDemo.business.response.corporateCustomers.GetByCorporateCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface CorporateCustomerService {
    Result add(CreateCorporateCustomerRequest createCorporateCustomerRequest);
    Result update(UpdateCorporateCustomerRequest updateCorporateCustomerRequest);
    Result delete(DeleteCorporateCustomerResquest deleteCorporateCustomerResquest);
    DataResult<List<GetAllCorporateCustomersResponse>> getAll();
    DataResult<GetByCorporateCustomerResponse> getById(int corporateCustomerId);
}
