package com.example.cicdexam;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.annotation.processing.SupportedOptions;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @UniqueElements(message = "Code is not unique")
    private String productCode;

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 100, message = "Name too large")
    private String productName;

    @NotBlank(message = "Category cannot be blank")
    private String category;

    @PositiveOrZero(message = "Stock cannot be zero")
    private int quantitityInStock;

    @Positive(message = "Price cannot be zero or lower")
    private float price;

}
