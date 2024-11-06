package com.example.cicdexam;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.annotation.processing.SupportedOptions;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Pattern()
    private String productCode;

    @NotBlank(message = "Error")
    @Max(value = 100, message = "Error")
    private String productName;

    @NotBlank(message = "Error")
    private String category;

    @PositiveOrZero(message = "Error")
    private int quantitityInStock;

    @Positive(message = "Error")
    private float price;

}
