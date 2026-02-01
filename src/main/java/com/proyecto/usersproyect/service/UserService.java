package com.proyecto.usersproyect.service;

import com.proyecto.usersproyect.model.User;

import java.util.List;

public interface UserService
{
    User save(User user);

    List<User> getAll();

    User findById(Integer id);

    User update(Integer id, User user);

    void delete(Integer id);
}
