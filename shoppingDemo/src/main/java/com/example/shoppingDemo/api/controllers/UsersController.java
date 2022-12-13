package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.request.users.CreateUserRequest;
import com.example.shoppingDemo.business.request.users.DeleteUserRequest;
import com.example.shoppingDemo.business.request.users.UpdateUserRequest;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateUserRequest createUserRequest) {
        return this.userService.add(createUserRequest);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateUserRequest updateUserRequest) {
        return this.userService.update(updateUserRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeleteUserRequest deleteUserRequest) {
        return this.userService.delete(deleteUserRequest);
    }
}
