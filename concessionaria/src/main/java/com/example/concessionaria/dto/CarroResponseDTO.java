package com.example.concessionaria.dto;

import com.example.concessionaria.model.Carro;
import lombok.Getter;

@Getter
public class CarroResponseDTO {

    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;
    private Double preco;
    private String image;

    public CarroResponseDTO(Carro carro) {
        this.id = carro.getId();
        this.marca = carro.getMarca();
        this.modelo = carro.getModelo();
        this.ano = carro.getAno();
        this.preco = carro.getPreco();
        this.image = carro.getImage();
    }

}
