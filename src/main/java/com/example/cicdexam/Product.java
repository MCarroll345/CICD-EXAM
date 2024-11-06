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

    @UniqueElements(message = "Not unique")
    @Pattern(regexp = "")
    private String productCode;

    @NotBlank(message = "Error")
    @Size(max = 100, message = "Error")
    private String productName;

    @NotBlank(message = "Error")
    private String category;

    @PositiveOrZero(message = "Error")
    private int quantitityInStock;

    @Positive(message = "Error")
    private float price;

}
