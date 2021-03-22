package com.example.demo.data;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
public class Accessori {
    private String nome;
    private List<String> caratteristiche;
    private BigDecimal prezzo;
}
