package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CustomerService;
import com.example.shoppingDemo.business.abstracts.IndividualCustomerService;
import com.example.shoppingDemo.business.abstracts.StateService;
import com.example.shoppingDemo.business.request.individualCustomers.CreateIndividualCustomerRequest;
import com.example.shoppingDemo.business.request.individualCustomers.DeleteIndividualCustomerRequest;
import com.example.shoppingDemo.business.request.individualCustomers.UpdateIndividualCustomerRequest;
import com.example.shoppingDemo.business.response.individualCustomers.GetAllIndividualCustomersResponse;
import com.example.shoppingDemo.business.response.individualCustomers.GetByIndividualCustomerResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.core.utilities.results.SuccessResult;
import com.example.shoppingDemo.dataAccess.abstracts.IndividualCustomerRepository;
import com.example.shoppingDemo.entities.concretes.IndividualCustomer;
import com.example.shoppingDemo.entities.concretes.State;
import com.example.shoppingDemo.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IndividualCustomerManager implements IndividualCustomerService {
    private IndividualCustomerRepository individualCustomerRepository;
    private StateService stateService;
    public IndividualCustomerManager(IndividualCustomerRepository individualCustomerRepository,StateService stateService){
        this.individualCustomerRepository=individualCustomerRepository;
        this.stateService = stateService;
    }
    @Override
    public Result add(CreateIndividualCustomerRequest createIndividualCustomerRequest) {
        State state = this.stateService.getState(1);
        IndividualCustomer individualCustomer=IndividualCustomer.builder()
                .nationalityId(createIndividualCustomerRequest.getNationalityId())
                .firstName(createIndividualCustomerRequest.getFirstName())
                .lastName(createIndividualCustomerRequest.getLastName())
                .birthDate(createIndividualCustomerRequest.getBirthDate())
                .gender(createIndividualCustomerRequest.getGender())
                .email(createIndividualCustomerRequest.getCreateCustomerRequest().getCreateUserRequest().getEmail())
                .password(createIndividualCustomerRequest.getCreateCustomerRequest().getCreateUserRequest().getPassword())
                .state(state)
                .customerNumber(createIndividualCustomerRequest.getCreateCustomerRequest().getCustomerNumber())
                .build();

        //user->customer->individualCustomer

        this.individualCustomerRepository.save(individualCustomer);
        return new SuccessResult("INDIVIDUAL.CUSTOMER.ADDED");
    }

    @Override
    public Result update(UpdateIndividualCustomerRequest updateIndividualCustomerRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteIndividualCustomerRequest deleteIndividualCustomerRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllIndividualCustomersResponse>> getAll() {
        List<IndividualCustomer> result = this.individualCustomerRepository.findAll();
        List<GetAllIndividualCustomersResponse> response = result.stream().map(individualCustomer -> GetAllIndividualCustomersResponse
                .builder()
                .individualCustomerId(individualCustomer.getIndividualCustomerId())
                .nationalityId(individualCustomer.getNationalityId())
                .birthDate(individualCustomer.getBirthDate())
                .firstName(individualCustomer.getFirstName())
                .lastName(individualCustomer.getLastName())
                .gender(individualCustomer.getGender())
                .build()).collect(Collectors.toList());
        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByIndividualCustomerResponse> getById(int individualCustomerId) {
        IndividualCustomer result = this.individualCustomerRepository.findById(individualCustomerId).get();
        GetByIndividualCustomerResponse response = GetByIndividualCustomerResponse.builder()
                .individualCustomerId(result.getIndividualCustomerId())
                .nationalityId(result.getNationalityId())
                .birthDate(result.getBirthDate())
                .firstName(result.getFirstName())
                .lastName(result.getLastName())
                .gender(result.getGender())
                .build();
        return new SuccessDataResult<>(response);
    }
}
