package com.proyecto.usersproyect.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera los ids automaticamente
    private int userId;

    @Column(nullable = false, length = 50, unique = true) //length es el maximo de caracteres
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 50, unique = true)
    private String email;
}
