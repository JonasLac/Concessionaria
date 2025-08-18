package com.example.concessionaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarroRequestDTO {

    private String marca;
    private String modelo;
    private Integer ano;
    private Double preco;
    private String image;

}
