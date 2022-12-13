package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CorporateCustomerService;
import com.example.shoppingDemo.business.abstracts.CustomerService;
import com.example.shoppingDemo.business.request.corporateCustomers.CreateCorporateCustomerRequest;
import com.example.shoppingDemo.business.request.corporateCustomers.DeleteCorporateCustomerResquest;
import com.example.shoppingDemo.business.request.corporateCustomers.UpdateCorporateCustomerRequest;
import com.example.shoppingDemo.business.response.corporateCustomers.GetAllCorporateCustomersResponse;
import com.example.shoppingDemo.business.response.corporateCustomers.GetByCorporateCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.core.utilities.results.SuccessResult;
import com.example.shoppingDemo.dataAccess.abstracts.CorporateCustomerRepository;
import com.example.shoppingDemo.entities.concretes.CorporateCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CorporateCustomerManager implements CorporateCustomerService {

    @Autowired
    private CorporateCustomerRepository corporateCustomerRepository;
    private CustomerService customerService;

    public CorporateCustomerManager(CorporateCustomerRepository corporateCustomerRepository,CustomerService customerService) {
        this.corporateCustomerRepository = corporateCustomerRepository;
        this.customerService=customerService;
    }

    @Override
    public Result add(CreateCorporateCustomerRequest createCorporateCustomerRequest) {

        CorporateCustomer corporateCustomer=CorporateCustomer.builder()
                .taxNumber(createCorporateCustomerRequest.getTaxNumber())
                .companyName(createCorporateCustomerRequest.getCompanyName())
                .build();
        this.corporateCustomerRepository.save(corporateCustomer);
        return new SuccessResult("CORPORATE.CUSTOMER.ADDED");
    }

    @Override
    public Result update(UpdateCorporateCustomerRequest updateCorporateCustomerRequest) {
        CorporateCustomer corporateCustomer=this.corporateCustomerRepository.findById(updateCorporateCustomerRequest.getCorporateCustomerId()).get();
        corporateCustomer.setTaxNumber(updateCorporateCustomerRequest.getTaxNumber());
        corporateCustomer.setCompanyName(updateCorporateCustomerRequest.getCompanyName());
        this.corporateCustomerRepository.save(corporateCustomer);
        return new SuccessResult("UPDATED.CORPORATE.CUSTOMER");
    }

    @Override
    public Result delete(DeleteCorporateCustomerResquest deleteCorporateCustomerResquest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllCorporateCustomersResponse>> getAll() {
        List<CorporateCustomer> result=this.corporateCustomerRepository.findAll();
        List<GetAllCorporateCustomersResponse> response=result.stream().map(corporateCustomer -> GetAllCorporateCustomersResponse.builder()
                .corporateCustomerId(corporateCustomer.getCorporateCustomerId())
                .taxNumber(corporateCustomer.getTaxNumber())
                .companyName(corporateCustomer.getCompanyName())
                .build()).collect(Collectors.toList());
        return  new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByCorporateCustomerResponse> getById(int corporateCustomerId) {
        CorporateCustomer result=this.corporateCustomerRepository.findById(corporateCustomerId).get();
        GetByCorporateCustomerResponse response=GetByCorporateCustomerResponse.builder()
                .corporateCustomerId(result.getCorporateCustomerId())
                .build();
        return new SuccessDataResult<>(response);
    }
}
