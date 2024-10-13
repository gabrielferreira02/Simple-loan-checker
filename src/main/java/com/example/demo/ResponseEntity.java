package com.example.demo;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ResponseEntity {

    @NotNull
    private String name;
    private List<Loan> typesAllowed;
}
