package com.proyecto.usersproyect.service;

import com.proyecto.usersproyect.model.User;

import java.util.List;

public interface UserService
{
    User create(User user);

    List<User> getAll();

    User getById(int id);

    User update(int id, User user);

    Void delete(int id);
}
