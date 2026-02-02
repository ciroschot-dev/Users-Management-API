package com.proyecto.usersproyect.service.impl;

import com.proyecto.usersproyect.exception.UserNotFoundException;
import com.proyecto.usersproyect.model.User;
import com.proyecto.usersproyect.repository.UserRepository;
import com.proyecto.usersproyect.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;

    @Override
    public User save(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id)
    {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public User update(Integer id, User updatedUser)
    {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setPassword(updatedUser.getPassword());
        existingUser.setEmail(updatedUser.getEmail());

        return userRepository.save(existingUser);
    }

    @Override
    public void delete(Integer id)
    {
        userRepository.deleteById(id);
    }
}
