package com.cvgras.cvgras.services;

import com.cvgras.cvgras.model.ResponseRID;
import com.cvgras.cvgras.model.UserModel;
import com.cvgras.cvgras.repository.UserRepository;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MapperFacade orikaMapperFacade;

    @Override
    public List<UserModel> getAllUsers() {
        List<UserModel> usersList = userRepository.findAll();
        return usersList;
    }

    @Override
    public ResponseRID createUser(UserModel request) {
        UserModel savedUsers = userRepository.save(request);
        return orikaMapperFacade.map(savedUsers, ResponseRID.class);
    }


    @Override
    public UserModel findUserById(String id) {
        Optional<UserModel> userFound = userRepository.findById(id);
            return orikaMapperFacade.map(userFound.get(), UserModel.class);
    }

    @Override
    public UserModel updateUserById(UserModel request, String id) {

        request.setId(id);
        UserModel userUpdatedFields = orikaMapperFacade.map(request, UserModel.class);
        UserModel updatedUser = userRepository.save(userUpdatedFields);
        return orikaMapperFacade.map(updatedUser, UserModel.class);
    }
}
