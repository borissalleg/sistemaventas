package com.anahi.ventas.controller;

import java.util.List;
import com.anahi.ventas.model.userModel;
import com.anahi.ventas.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/user")
public class userController {

    @Autowired
    private userService userServices;

    @GetMapping(value = "/list")
    public List<userModel> findAll() {
        return userServices.findAll();
    }

    @PostMapping(value = "/save")
    public userModel create(@RequestBody userModel user) {
        return userServices.create(user);
    }

    @PutMapping(value = "/update")
    public userModel update(@RequestBody userModel user) {
        return userServices.update(user);
    }

    @GetMapping(value = "/find/{id}")
    public userModel findById(@PathVariable("id") Integer idUser) {
        return userServices.findById(idUser);
    }

    @GetMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Integer idUser) {
        userServices.delete(idUser);
    }
}
