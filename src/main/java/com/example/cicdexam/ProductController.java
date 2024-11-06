package com.example.cicdexam;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService myProduct;

    public ProductController(){
        myProduct = new ProductService();
    }

    @PostMapping("/addProduct")
    public List<Product> addProduct(@Valid @RequestBody Product product){
        return myProduct.addProduct(product);
    }

    @GetMapping("/getProduct/{code}")
    public List<Product> getProduct(@Valid @PathVariable String code){
        return myProduct.getProduct(code);
    }

    @DeleteMapping("/deleteProduct/{code}")
    public List<Product> deleteProduct(@Valid @PathVariable String code){
        return myProduct.deleteProduct(code);
    }

    @PutMapping("/setProduct/{code}")
    public List<Product> setProduct(@Valid  @RequestBody  Product product, @PathVariable String code){
        return myProduct.editProduct(code, product);
    }

}
