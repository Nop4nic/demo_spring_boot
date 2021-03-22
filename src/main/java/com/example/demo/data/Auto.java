package com.example.demo.data;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@RequiredArgsConstructor
public class Auto {

    @NotNull
    @Size(min = 3, max = 50, message = "La marca è obbligatoria ")
    private String marca;
    private String modello;
    private List<Accessori> accessori;
}
