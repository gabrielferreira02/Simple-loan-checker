package com.example.demo;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Loan {

    @NotNull
    private String type;
    private int interest_rate;
}
