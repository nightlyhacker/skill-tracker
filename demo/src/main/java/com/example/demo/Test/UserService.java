package com.example.demo.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public  UserService(UserRepository userRepository){this.userRepository=userRepository;}

    public Optional<User> addUser(User user){
        userRepository.save(user);
        return userRepository.findById(user.getId());
    }

    public User modifyUser(Integer userId,User user){
        Optional<User> useropt=userRepository.findById(userId);
        User existingUser=useropt.get();
        user.setAssociateId(existingUser.getAssociateId());
        user.setEmail(existingUser.getEmail());
        user.setMobNum(existingUser.getMobNum());
        user.setName(existingUser.getName());
        user.setId(existingUser.getId());
        userRepository.save(user);
        return user;
    }


}
