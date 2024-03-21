package com.example;

import javax.persistence.*;

@Entity
@Table(name = "users")

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "username", nullable = false, length = 30) //nullable = false 不可為空
    private String username;

    @Column(name = "email", nullable = false, length = 60)
    private String email;

    @Column(name = "password", nullable = false, length = 40)
    private String password;

    @Column(name = "cover_image") //封面照
    private byte[] coverImage;

    @Column(name = "biography", nullable = false, length = 400) //使用者的自我介紹
    private String biography;

}
