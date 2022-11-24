package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.suppliers.CreateSupplierRequest;
import com.example.shoppingDemo.business.request.suppliers.DeleteSupplierRequest;
import com.example.shoppingDemo.business.request.suppliers.UpdateSupplierRequest;
import com.example.shoppingDemo.business.response.suppliers.GetAllSuppliersResponse;
import com.example.shoppingDemo.business.response.suppliers.GetBySupplierResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface SupplierService {

    Result add(CreateSupplierRequest createSupplierRequest);
    Result update(UpdateSupplierRequest updateSupplierRequest);
    Result delete(DeleteSupplierRequest deleteSupplierRequest);
    DataResult<List<GetAllSuppliersResponse>> getAll();
    DataResult<GetBySupplierResponse> getById(int id);
}
