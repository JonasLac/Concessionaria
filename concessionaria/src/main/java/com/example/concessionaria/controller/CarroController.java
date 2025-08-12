package com.example.concessionaria.controller;

import com.example.concessionaria.model.Carro;
import com.example.concessionaria.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarroController {
    // controle de acesso aos carros
    @Autowired
    private CarroRepository repository;
    @GetMapping
    public List<Carro> getAll(){
        List<Carro> carList = repository.findAll();
        return carList;
    }

}
