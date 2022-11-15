package com.example.FoodSubscriptionService.entity;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private String id;
    private String password;
    private String firstName;
    private String lastName;
    //private Address address;

}
