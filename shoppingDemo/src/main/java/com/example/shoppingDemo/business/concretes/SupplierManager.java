package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.StateService;
import com.example.shoppingDemo.business.abstracts.SupplierService;
import com.example.shoppingDemo.business.request.suppliers.CreateSupplierRequest;
import com.example.shoppingDemo.business.request.suppliers.DeleteSupplierRequest;
import com.example.shoppingDemo.business.request.suppliers.UpdateSupplierRequest;
import com.example.shoppingDemo.business.response.suppliers.GetAllSuppliersResponse;
import com.example.shoppingDemo.business.response.suppliers.GetBySupplierResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.core.utilities.results.SuccessResult;
import com.example.shoppingDemo.dataAccess.abstracts.SupplierRepository;
import com.example.shoppingDemo.entities.concretes.State;
import com.example.shoppingDemo.entities.concretes.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierManager implements SupplierService {
    private SupplierRepository supplierRepository;
    private StateService stateService;

    @Autowired
    public SupplierManager(SupplierRepository supplierRepository,StateService stateService) {
        this.supplierRepository = supplierRepository;
        this.stateService=stateService;
    }

    @Override
    public Result add(CreateSupplierRequest createSupplierRequest) {
       State state =this.stateService.getState(1);
        Supplier supplier = Supplier.builder()
                .name(createSupplierRequest.getName())
                .point(createSupplierRequest.getPoint())
                .state(state)
                .build();
        this.supplierRepository.save(supplier);
        return new SuccessResult("Added Supplier");
    }

    @Override
    public Result update(UpdateSupplierRequest updateSupplierRequest) {
        Supplier supplier=this.supplierRepository.findById(updateSupplierRequest.getId()).get();
        supplier.setName(supplier.getName());
        supplier.setPoint(supplier.getPoint());
        this.supplierRepository.save(supplier);
        return new SuccessResult("UPDATED.SUPPLIER");

    }

    @Override
    public Result delete(DeleteSupplierRequest deleteSupplierRequest) {
        State state =this.stateService.getState(2);
        Supplier supplier=this.supplierRepository.findById(deleteSupplierRequest.getId()).get();
        supplier.setState(state);
        return new SuccessResult("DELETED.SUPPLIER");
    }

    @Override
    public DataResult<List<GetAllSuppliersResponse>> getAll() {
        List<Supplier> result = this.supplierRepository.findAll();
        List<GetAllSuppliersResponse> response = result.stream().map(supplier -> GetAllSuppliersResponse.builder()
                .id(supplier.getId())
                .name(supplier.getName())
                .point(supplier.getPoint())
                .build()).collect(Collectors.toList());
        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetBySupplierResponse> getById(int id) {
        Supplier result = this.supplierRepository.findById(id).get();
        GetBySupplierResponse response = GetBySupplierResponse.builder()
                .name(result.getName())
                .point(result.getPoint())
                .build();
        return new SuccessDataResult<>(response);
    }
}
