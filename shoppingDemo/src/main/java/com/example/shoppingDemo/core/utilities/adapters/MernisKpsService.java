package com.example.shoppingDemo.core.utilities.adapters;

import com.example.mernis.HRWKPSPublicSoap;
import com.example.shoppingDemo.business.abstracts.UserCheckService;
import com.example.shoppingDemo.business.request.individualCustomers.CreateIndividualCustomerRequest;
import com.example.shoppingDemo.entities.concretes.IndividualCustomer;
import org.springframework.stereotype.Service;

@Service
public class MernisKpsService implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(CreateIndividualCustomerRequest createIndividualCustomerRequest) {
        HRWKPSPublicSoap hrwkpsPublicSoap = new HRWKPSPublicSoap();
        try {
            boolean isValidPerson = hrwkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(createIndividualCustomerRequest.getNationalityId()),
                    createIndividualCustomerRequest.getFirstName().toUpperCase(), createIndividualCustomerRequest.getLastName().toUpperCase(), createIndividualCustomerRequest.getBirthDate().getYear());
            return isValidPerson;
        } catch (Exception e) {
            System.out.println("Kişi bulunamadı");
        }
        return false;
    }
}

