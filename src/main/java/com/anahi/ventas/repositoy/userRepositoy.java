package com.anahi.ventas.repositoy;

import com.anahi.ventas.model.userModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepositoy extends JpaRepository<userModel, Integer> {

}
