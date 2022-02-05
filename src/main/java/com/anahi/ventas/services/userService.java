package com.anahi.ventas.services;

import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.MediaSize.Other;

import com.anahi.ventas.model.userModel;
import com.anahi.ventas.repositoy.userRepositoy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService implements userServiceInterface {
    @Autowired
    private userRepositoy userRepo;

    @Override
    public userModel create(userModel user) {

        return userRepo.save(user);
    }

    @Override
    public userModel update(userModel user) {
        return userRepo.save(user);
    }

    @Override
    public userModel findById(Integer id) {
        Optional<userModel> userOptional = userRepo.findById(id);
        return userOptional.get();
    }

    @Override
    public List<userModel> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void delete(Integer id) {
        userRepo.deleteById(id);

    }

}
