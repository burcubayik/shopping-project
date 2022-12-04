package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.StateService;
import com.example.shoppingDemo.dataAccess.abstracts.StateRepository;
import com.example.shoppingDemo.entities.concretes.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateManager implements StateService {
    private StateRepository stateRepository;
    @Autowired
    public StateManager(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }



    @Override
    public State getState(int id) {
        State state= this.stateRepository.findById(id).get();
        return state;
    }
}
