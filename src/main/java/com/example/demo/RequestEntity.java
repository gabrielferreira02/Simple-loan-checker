package com.example.demo;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RequestEntity {
    @NotBlank(message = "Campo não pode estar vazio")
    @NotNull(message = "Campo não pode ser nulo")
    private String name;

    @NotNull(message = "Campo não pode ser nulo")
    @CPF(message = "Cpf inválido")
    private String cpf;

    @Min(value = 18, message = "Idade precisa ser maior que 18")
    private int age;

    @NotNull(message = "Campo não pode ser nulo")
    @Min(value = 0, message = "Valor deve ser positivo")
    private double wage;

    @NotNull(message = "Campo não pode ser nulo")
    @NotBlank(message = "Campo não pode estar vazio")
    private String location;
}
