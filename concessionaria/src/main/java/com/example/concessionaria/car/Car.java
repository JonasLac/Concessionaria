package com.example.concessionaria.car;

import jakarta.persistence.*;

@Table(name = "car")
@Entity(name = "car")
public class Car {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String image;

    private Integer price;
}
