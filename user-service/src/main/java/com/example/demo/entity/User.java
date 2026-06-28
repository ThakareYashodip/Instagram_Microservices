package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username" , nullable = false , unique = true)
    private String username;

    @Column(name = "email" , nullable = false , unique = true)
    private String email;

    @Column(name = "password" , unique = true)
    private String password;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "bio" , length = 255)
    private String bio;

    @Column(name = "profilePictureUrl")
    private String profilePictureUrl;

    @CreatedDate
    private Date createAt;

}
