package com.example.concessionaria.controller;

import com.example.concessionaria.car.Car;
import com.example.concessionaria.car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {
    // controle de acesso aos carros
    @Autowired
    private CarRepository repository;
    @GetMapping
    public List<Car> getAll(){
        List<Car> carList = repository.findAll();
        return carList;
    }

}
