package com.cvgras.cvgras.services;

import com.cvgras.cvgras.model.ResponseRID;
import com.cvgras.cvgras.model.UserModel;

import java.util.List;

public interface UserService {

    List<UserModel> getAllUsers();

    ResponseRID createUser(UserModel request);

    UserModel findUserById(String id);

    UserModel updateUserById(UserModel request, String id);
}
