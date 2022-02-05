package com.anahi.ventas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class rolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_rol", length = 50)
    private String nameRol;

    @ManyToMany(mappedBy = "roles")
    private List<userModel> rolUsuario;

    public rolModel() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameRol() {
        return this.nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }

    public List<userModel> getRolUsuario() {
        return this.rolUsuario;
    }

    public void setRolUsuario(List<userModel> rolUsuario) {
        this.rolUsuario = rolUsuario;
    }


}
