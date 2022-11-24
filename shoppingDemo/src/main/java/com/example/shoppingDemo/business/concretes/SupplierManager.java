package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.SupplierService;
import com.example.shoppingDemo.business.request.suppliers.CreateSupplierRequest;
import com.example.shoppingDemo.business.request.suppliers.DeleteSupplierRequest;
import com.example.shoppingDemo.business.request.suppliers.UpdateSupplierRequest;
import com.example.shoppingDemo.business.response.suppliers.GetAllSuppliersResponse;
import com.example.shoppingDemo.business.response.suppliers.GetBySupplierResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SupplierManager implements SupplierService {
    @Override
    public Result add(CreateSupplierRequest createSupplierRequest) {
        return null;
    }

    @Override
    public Result update(UpdateSupplierRequest updateSupplierRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteSupplierRequest deleteSupplierRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllSuppliersResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetBySupplierResponse> getById(int id) {
        return null;
    }
}
