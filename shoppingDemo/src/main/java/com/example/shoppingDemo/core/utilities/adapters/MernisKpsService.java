package com.example.shoppingDemo.core.utilities.adapters;

import com.example.mernis.HRWKPSPublicSoap;
import com.example.shoppingDemo.business.abstracts.UserCheckService;
import com.example.shoppingDemo.entities.concretes.IndividualCustomer;
import org.springframework.stereotype.Service;

@Service
public class MernisKpsService implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(IndividualCustomer individualCustomer) {
        HRWKPSPublicSoap hrwkpsPublicSoap = new HRWKPSPublicSoap();
        try {
            boolean isValidPerson = hrwkpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(individualCustomer.getNationalityId()),
                    individualCustomer.getFirstName().toUpperCase(), individualCustomer.getLastName().toUpperCase(), individualCustomer.getBirthDate().getYear());
            return isValidPerson;
        } catch (Exception e) {
            System.out.println("Kişi bulunamadı");
        }
        return false;
    }
}

