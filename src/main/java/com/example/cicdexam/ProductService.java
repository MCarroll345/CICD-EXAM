package com.example.cicdexam;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductService {

    private List<Product> myList = new ArrayList<>();

    public List<Product> addProduct(Product product){
        myList.add(product);
        return myList;
    }

    public List<Product> getProduct(String code, Product product) {
        for(Product p:myList){
            if(p.getProductCode() == code){
                return getProduct(code, product);
            }
        }
        throw new NoSuchElementException("There is no product with the code: " + code);
    }

    public List<Product> editProduct(String code, Product product) {
        for(Product p:myList){
            if(p.getProductCode() == code){
                myList.set
            }
        }
    }
}
