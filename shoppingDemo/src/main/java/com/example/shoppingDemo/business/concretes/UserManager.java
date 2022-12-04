package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.StateService;
import com.example.shoppingDemo.business.abstracts.UserService;
import com.example.shoppingDemo.business.request.users.CreateUserRequest;
import com.example.shoppingDemo.business.request.users.DeleteUserRequest;
import com.example.shoppingDemo.business.request.users.UpdateUserRequest;
import com.example.shoppingDemo.business.response.users.GetAllUserResponse;
import com.example.shoppingDemo.business.response.users.GeyByUserResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.core.utilities.results.SuccessResult;
import com.example.shoppingDemo.dataAccess.abstracts.StateRepository;
import com.example.shoppingDemo.dataAccess.abstracts.UserRepository;
import com.example.shoppingDemo.entities.concretes.State;
import com.example.shoppingDemo.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {
    private UserRepository userRepository;
    private StateService stateService;

    public UserManager(UserRepository userRepository,StateService stateService) {
        this.userRepository = userRepository;
        this.stateService= stateService;
    }

    @Override
    public Result add(CreateUserRequest createUserRequest) {
        State state = this.stateService.getState(1);
        User user = User.builder()
                .email(createUserRequest.getEmail())
                .password(createUserRequest.getPassword())
                .state(state)
                .build();
        this.userRepository.save(user);

        return new SuccessResult("Kişi eklendi");
    }

    @Override
    public Result update(UpdateUserRequest updateUserRequest) {
        User user = this.userRepository.findById(updateUserRequest.getId()).get();
        user.setPassword(user.getPassword());
        this.userRepository.save(user);
        return new SuccessResult("Kişi eklendi");
    }

    @Override
    public Result delete(DeleteUserRequest deleteUserRequest) {

        return null;
    }

}