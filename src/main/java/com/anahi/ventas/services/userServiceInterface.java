package com.anahi.ventas.services;

import java.util.List;

import com.anahi.ventas.model.userModel;

public interface userServiceInterface {
    userModel create(userModel user);

    userModel update(userModel user);

    userModel findById(Integer id);

    List<userModel> findAll();

    void delete(Integer id);
}
