package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CorporateCustomerService;
import com.example.shoppingDemo.business.request.corporateCustomers.CreateCorporateCustomerRequest;
import com.example.shoppingDemo.business.request.corporateCustomers.DeleteCorporateCustomerResquest;
import com.example.shoppingDemo.business.request.corporateCustomers.UpdateCorporateCustomerRequest;
import com.example.shoppingDemo.business.response.corporateCustomers.GetAllCorporateCustomersResponse;
import com.example.shoppingDemo.business.response.corporateCustomers.GetByCorporateCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorporateCustomerManager implements CorporateCustomerService {
    @Override
    public Result add(CreateCorporateCustomerRequest createCorporateCustomerRequest) {
        return null;
    }

    @Override
    public Result update(UpdateCorporateCustomerRequest updateCorporateCustomerRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteCorporateCustomerResquest deleteCorporateCustomerResquest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllCorporateCustomersResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetByCorporateCustomerResponse> getById(int corporateCustomerId) {
        return null;
    }
}
