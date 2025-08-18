package com.example.concessionaria.controller;

import com.example.concessionaria.dto.CarroRequestDTO;
import com.example.concessionaria.dto.CarroResponseDTO;
import com.example.concessionaria.model.Carro;
import com.example.concessionaria.repository.CarroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car")
@CrossOrigin(origins = "*") // permite acesso de qualquer origem
public class CarroController {

    private final CarroRepository repository;

    public CarroController(CarroRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<CarroResponseDTO> getAll() {
        return repository.findAll().stream().map(CarroResponseDTO::new).toList();
    }

    @PostMapping
    public CarroResponseDTO create(@RequestBody CarroRequestDTO dto) {
        Carro carro = Carro.builder()
                .marca(dto.getMarca())
                .modelo(dto.getModelo())
                .ano(dto.getAno())
                .preco(dto.getPreco())
                .image(dto.getImage())
                .build();

        repository.save(carro);
        return new CarroResponseDTO(carro);
    }
}
