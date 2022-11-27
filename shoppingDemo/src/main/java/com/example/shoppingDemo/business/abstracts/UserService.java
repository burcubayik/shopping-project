package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.users.CreateUserRequest;
import com.example.shoppingDemo.business.request.users.DeleteUserRequest;
import com.example.shoppingDemo.business.request.users.UpdateUserRequest;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface UserService {
    Result add(CreateUserRequest createUserRequest);
    Result update(UpdateUserRequest updateUserRequest);
    Result delete(DeleteUserRequest deleteUserRequest);
}
