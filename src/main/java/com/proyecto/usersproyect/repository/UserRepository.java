package com.proyecto.usersproyect.repository;

import com.proyecto.usersproyect.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
}
