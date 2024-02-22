package com.example.user.service.services;

import com.example.user.service.entities.User;

import java.util.List;

public interface UserService {

    //user operations

    //create
    User saveUser(User user);


    //Get All User
    List<User> getAllUser();

    //Get Single User of given userid
    User getUser(String userId);

    //update
    User updateUser(String userId, User updatedUser);

    //delete
    void deleteUser(String userId);
}
