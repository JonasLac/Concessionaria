package com.example.concessionaria.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "carros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;
    private Double preco;
    private String image;
}
